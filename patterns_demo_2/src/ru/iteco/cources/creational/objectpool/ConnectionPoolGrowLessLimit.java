package ru.iteco.cources.creational.objectpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ConnectionPoolGrowLessLimit {
    private static List<ConnectionResource> resourceList = new ArrayList<>();
    private static AtomicInteger capacity = new AtomicInteger(10);
    private static int MAX_POOL_SIZE = 20;
    private static int MIN_POOL_SIZE = 10;

    static {
        for (int i = 0; i < MIN_POOL_SIZE; i++) {
            resourceList.add(new ConnectionResource());
        }
    }

    public static synchronized ConnectionResource getConnectionResourceFromPool() throws Exception {
        if (resourceList.size() > 0) {
            ConnectionResource resource = resourceList.get(resourceList.size() - 1);
            resourceList.remove(resourceList.size() - 1);

            return resource;
        } else if (capacity.get() < MAX_POOL_SIZE) {
            capacity.incrementAndGet();
            return new ConnectionResource();
        } else {
            Thread.sleep(1000);
            return getConnectionResourceFromPool();
        }
    }

    public static void returnConnectionResourceToPool(ConnectionResource resource) throws CloneNotSupportedException {
        if (capacity.get() > MIN_POOL_SIZE) capacity.decrementAndGet();

        if (resourceList.size() >= MAX_POOL_SIZE * 70 / 100 || resourceList.size() >= MIN_POOL_SIZE) {
            resourceList.remove(resource);
        } else {
            resourceList.add(resource.clone());
        }
        System.out.println("log [INFO]: ResourceList.size after return : " + resourceList.size() + " capacity: " + capacity.get());
    }
}
