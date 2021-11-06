package ru.iteco.cources.creational.objectpool;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 30; i++) {
            Thread thread = new Thread(() -> {
                try {
                    ConnectionResource resource = ConnectionPoolGrowLessLimit.getConnectionResourceFromPool();
                    resource.work();
                    ConnectionPoolGrowLessLimit.returnConnectionResourceToPool(resource);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            });
            thread.start();
        }
    }
}
