package ru.iteco.cources.creational.objectpool;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPoolGrowLimit {

    private static final Double EXTEND_PROPORTION = 0.7d;
    private static final Integer DEFAULT_CAPACITY = 10;
    private static final Integer MAX_CAPACITY = 20;
    private static volatile Integer capacity = DEFAULT_CAPACITY;
    private static volatile int DELAY = 500;
    private static List<ConnectionResource> resourceList = new ArrayList<>();

    static {
        for (int i = 0; i < DEFAULT_CAPACITY; i++) {
            resourceList.add(new ConnectionResource());
        }
    }

    public static ConnectionResource getConnectionFromPool() throws Exception {
        if (resourceList.size() > 0) {
            return takeFromPool();
        } else {
            if (capacity <= MAX_CAPACITY) {
                extendPool();
                return takeFromPool();
            } else {
                Thread.sleep(DELAY);
                return getConnectionFromPool();
            }
        }
    }

    public static void returnConnectionToPool(ConnectionResource connectionResource) {
        connectionResource.retrieve();
        resourceList.add(connectionResource);
        if (resourceList.size() > EXTEND_PROPORTION * capacity) {
            for (int i = 0; i < capacity - DEFAULT_CAPACITY; i++) {
                resourceList.remove(resourceList.size() - 1);
            }
            capacity = DEFAULT_CAPACITY;
        }
    }

    private static synchronized void extendPool() {
        resourceList.add(new ConnectionResource());
        capacity++;
    }

    private static ConnectionResource takeFromPool() {
        final ConnectionResource resource = resourceList.remove(resourceList.size() - 1);
        resource.take();
        return resource;
    }

}
