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
        if (resourceList.size() > 0) {
            ConnectionResource connectionResource;
            for (int i = 0; i < resourceList.size(); i++) {
                connectionResource = resourceList.get(i);
                if (!connectionResource.isBlocked()) {
                    resourceList.remove(connectionResource);
                    return connectionResource;
                }
            }
            return null;
        } else {
            if (capacity <= 20) {
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
        connectionResource.setBlocked(true);
        if (resourceList.size() - capacity > 6) {
            for (int i = resourceList.size(); i > 9 ; i--) {
                resourceList.remove(resourceList.size() - 1);
            }
        }
        capacity = 10;
    }
}
