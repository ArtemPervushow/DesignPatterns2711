package ru.iteco.cources.creational.objectpool;

import ru.iteco.cources.creational.objectpool.ConnectionResource;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPoolGrowLimit {
    private static List<ConnectionResource> resourceList = new ArrayList<>();
    private static List<ConnectionResource> returnedResources = new ArrayList<>();
    private static volatile short capacity = 10;
    private static int returnedResCount = 0;
    static {
        for (int i = 0; i < 10; i++) {
            resourceList.add(new ConnectionResource());
        }
    }

    public static ConnectionResource getConnectionFromPool() {
        try{

            if (resourceList.size() > 0) {
                for (ConnectionResource res: resourceList
                     ) {
                    if(!returnedResources.contains(res)) return res;
                }
                return new ConnectionResource();
//                ConnectionResource connectionResource = resourceList.get(resourceList.size() - 1);
//                if (!returnedResources.contains(connectionResource)) return connectionResource;
//                else return new ConnectionResource(); //если ресурс уже был выдан

            } else if (capacity <= 20) {
                    ConnectionResource connectionResource = new ConnectionResource();
                    capacity++;
                    return connectionResource;
                    } else {
                    ConnectionResource res = null;
                    while (null == res) if (resourceList.size() > 1) res = getConnectionFromPool();
                    return res;
                }

            }catch (IndexOutOfBoundsException e){System.out.println("That doesn't work if we request too many connection resources!!!"); System.exit(-666); return null;}


    }
    public static void returnConnectionToPool(ConnectionResource connectionResource) {
        resourceList.add(connectionResource);
        returnedResources.add(connectionResource);
        if((++returnedResCount >= 10) && (--capacity < 10)) while(resourceList.size()>10) resourceList.remove(resourceList.size()-1);
    }
}
