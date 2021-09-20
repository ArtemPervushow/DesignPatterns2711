package ru.iteco.cources.creational.objectpool;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPoolGrowLimit {
    private static List<ConnectionResource> resources;
    private static short capacity = 10;
    private static final int maxValue = capacity;

    static {
        resources = new ArrayList<>();
        for (int i = 0; maxValue > i; i++) {
            resources.add(new ConnectionResource());
        }
    }

    public static ConnectionResource getConnectionFromPool() throws Exception {
        if (resources.size() > 0) {
            return resources.remove(resources.size() - 1);
        } else if (capacity <= 20) {
            var connectionResource = new ConnectionResource();
            capacity++;
            return connectionResource;
        } else {
            Thread.sleep(500);
            return getConnectionFromPool();
        }
    }

    public static void releaseConnectionToPool(ConnectionResource connection) {
        if (capacity > maxValue && resources.size() == maxValue) {
            connection.close();
            capacity--;
        } else {
            connection.close();
            resources.add(new ConnectionResource());
        }
    }
}

