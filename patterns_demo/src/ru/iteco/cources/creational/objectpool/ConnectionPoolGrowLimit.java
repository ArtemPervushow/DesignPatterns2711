package ru.iteco.cources.creational.objectpool;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPoolGrowLimit {
    private static final float shrinkingThreshold = 0.7f;
    private static final int initialCapacity = 10;
    private static List<ConnectionResource> resourceList = new ArrayList<>();
    private static volatile short capacity = initialCapacity;

    static {
        for (int i = 0; i < 10; i++) {
            resourceList.add(new ConnectionResource());
        }
    }

    public static ConnectionResource getConnectionFromPool() throws Exception {
        if(resourceList.size() > 0) {
            return issueFromPool();
        } else {
            if(capacity <= 20) {
                grow();
                return issueFromPool();
            } else {
                Thread.sleep(500);
                return getConnectionFromPool();
            }
        }
    }

    public static void returnConnectionToPool(ConnectionResource connectionResource) {
        connectionResource.retrieve();
        resourceList.add(connectionResource);
        if ((float)resourceList.size()/capacity > shrinkingThreshold) {
            shrink();
        }
    }

    private static ConnectionResource issueFromPool() {
        final ConnectionResource resource = resourceList.remove(resourceList.size() - 1);
        resource.issue();
        return resource;
    }

    private static synchronized void grow() {
        resourceList.add(new ConnectionResource());
        capacity++;
    }

    private static synchronized void shrink() {
        final int exceedingCount = capacity - initialCapacity;
        for (int i = 0; i < exceedingCount; i++) {
            resourceList.remove(resourceList.size() - 1);
        }
        capacity = initialCapacity;
    }
}
