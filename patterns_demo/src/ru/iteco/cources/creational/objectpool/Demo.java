package ru.iteco.cources.creational.objectpool;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            Thread thread = new Thread(() -> {
                try {
                    Thread.sleep(new Random().nextInt(200));

                    ConnectionResource resource = ConnectionPoolGrowLimit.getConnectionFromPool();
                    resource.work();

                    Thread.sleep(new Random().nextInt(200));
                    ConnectionPoolGrowLimit.returnConnectionToPool(resource);

                    System.out.println("try work on returned resource " + Thread.currentThread().getName());
                    resource.work();

                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            });
            thread.start();
        }
    }
}
