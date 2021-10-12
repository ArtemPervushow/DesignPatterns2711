package ru.iteco.cources.creational.objectpool;

import java.util.Random;

public class ConnectionResource {
    private boolean issued = false;

    public void work(){
        if (!issued) {
            throw new IllegalStateException("Resource is not issued.");
        }

        try {
            System.out.println("Now working " + Thread.currentThread().getName());
            Thread.sleep(new Random().nextInt(2000));
            System.out.println("End working " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void issue() {
        issued = true;
    }

    public void retrieve() {
        issued = false;
    }
}
