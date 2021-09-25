package ru.iteco.cources.creational.objectpool;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
    private static List<ConnectionResource> resourceList = new ArrayList<>();

    static {
        for (int i = 0; i < 10; i++) {
            resourceList.add(new ConnectionResource());
        }
    }

    public static ConnectionResource getConnectionResourceFromPool() throws Exception {
        if(resourceList.size() > 0) {
            ConnectionResource resource = resourceList.get(resourceList.size() - 1);
            resourceList.remove(resourceList.size() - 1);

            return resource;
        } else {
            throw new Exception("no free resource in pool");
        }
    }

    public static void returnConnectionResourceToPool(ConnectionResource resource){
        resourceList.add(resource);
    }
}
