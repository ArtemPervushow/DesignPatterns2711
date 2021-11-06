package ru.iteco.cources.creational.objectpool;

import java.util.Random;

public class ConnectionResource implements Cloneable {
    public void work() {
        try {
            System.out.println("Start working of thread " + Thread.currentThread().getName());
            Thread.sleep(new Random().nextInt(2000));
            System.out.println("End working of thread " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ConnectionResource clone() throws CloneNotSupportedException {
        return (ConnectionResource) super.clone();
    }
}
