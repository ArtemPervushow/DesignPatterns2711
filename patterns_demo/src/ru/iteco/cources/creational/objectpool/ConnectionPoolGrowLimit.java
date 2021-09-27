package ru.iteco.cources.creational.objectpool;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPoolGrowLimit {
    private static List<ConnectionResource> resourceList = new ArrayList<>();
    private static volatile short capacity = 10;
    private static volatile int free = 100;
    private static volatile short LIMIT = 70;

    static {
        for (int i = 0; i < 10; i++) {
            resourceList.add(new ConnectionResource());
        }
    }

    public static ConnectionResource getConnectionFromPool() throws Exception {
        if (resourceList.size() > 0) {
            ConnectionResource connectionResource = resourceList
                    .get(resourceList.size() - 1);
            resourceList.remove(connectionResource);
            connectionResource.setBlocked(false);

            return connectionResource;
        } else {
            if (capacity < 20) {
                ConnectionResource connectionResource = new ConnectionResource();
                connectionResource.setBlocked(false);
                capacity++;
                return connectionResource;
            } else {
                Thread.sleep(500);
                return getConnectionFromPool();
            }
        }
    }

    public static void returnConnectionToPool(ConnectionResource connectionResource) {
        connectionResource.setBlocked(true);
        free = 100 * resourceList.size() / capacity;
        System.out.println("free resources in pool: %" + free + " size: " + resourceList.size() + " capacity: " + capacity);
        if (capacity > 10 && free >= LIMIT) {
            while (resourceList.size() > 10) {
                resourceList.remove(resourceList.size() - 1);
            }
            capacity = 10;
            System.out.println("pool was cleared: size: " + resourceList.size() + " capacity: " + capacity);
        } else if (capacity == 10 && resourceList.size() == 10) {
            System.out.println("pool is full of free resources");
        } else {
            resourceList.add(connectionResource);
            System.out.println("resource was returned in pool");
        }
    }
}
