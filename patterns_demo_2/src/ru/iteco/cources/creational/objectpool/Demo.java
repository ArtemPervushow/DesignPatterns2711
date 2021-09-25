package ru.iteco.cources.creational.objectpool;

public class Demo {
    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            Thread thread = new Thread(() -> {
                try {
                    ConnectionResource resource = ConnectionPoolGrowLimit.getConnectionResourceFromPool();
                    resource.work();
                    ConnectionPoolGrowLimit.returnConnectionResourceToPool(resource);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            });
            thread.start();
        }
    }
}
