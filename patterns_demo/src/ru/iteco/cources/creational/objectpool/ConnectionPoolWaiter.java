package ru.iteco.cources.creational.objectpool;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPoolWaiter {
    private static List<ConnectionResource> resourceList = new ArrayList<>();

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
            Thread.sleep(500);
            return getConnectionFromPool();
        }
    }

    public static void returnConnectionToPool(ConnectionResource connectionResource) {
        resourceList.add(connectionResource);
    }
}
