package ru.iteco.cources.creational.objectpool;

import java.util.Random;

public class ConnectionResource {

    private boolean taken = false;

    public void work(){
        if (!taken) {
            throw new IllegalStateException("Resource is not taken.");
        }

        try {
            System.out.println("Now working " + Thread.currentThread().getName());
            Thread.sleep(new Random().nextInt(2000));
            System.out.println("End working " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void take() {
        taken = true;
    }

    public void retrieve() {
        taken = false;
    }
}
