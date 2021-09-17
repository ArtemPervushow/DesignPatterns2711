package ru.iteco.cources.creational.objectpool;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPoolGrowLimit {
    private static List<ConnectionResource> resourceList = new ArrayList<>();
    private static volatile short capacity = 10;

    static {
        for (int i = 0; i < 10; i++) {
            resourceList.add(new ConnectionResource());
        }
    }

    public static ConnectionResource getConnectionFromPool() throws Exception {
        if(resourceList.size() > 0) {
            ConnectionResource connectionResource = resourceList
                    .get(resourceList.size() - 1);
            resourceList.remove(connectionResource);

            return connectionResource;
        } else {
            if(capacity <= 20) {
                ConnectionResource connectionResource = new ConnectionResource();
                capacity++;
                return connectionResource;
            } else {
                Thread.sleep(500);
                return getConnectionFromPool();
            }
        }
    }

    public static void returnConnectionToPool(ConnectionResource connectionResource) {
        resourceList.add(connectionResource);
    }
}
