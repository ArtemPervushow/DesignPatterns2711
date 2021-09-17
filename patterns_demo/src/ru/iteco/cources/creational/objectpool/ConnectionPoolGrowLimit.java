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
            if(resourceList.size() > 14){
                capacity--;
                System.out.println("pool: "+ resourceList.size() + "; max_pool: " + capacity);
            }
            return connectionResource;
        } else {
            if(capacity < 20) {
                ConnectionResource connectionResource = new ConnectionResource();
                capacity++;
                System.out.println("pool: "+ resourceList.size() + "; max_pool: " + capacity);
                return connectionResource;
            } else {
                Thread.sleep(500);
                return getConnectionFromPool();
            }
        }
    }

    public static void returnConnectionToPool(Resource resource) {
        resourceList.add(resource.getConnectionResource());
        resource.setConnectionResource(null);
    }
}
