package ru.iteco.cources.creational.objectpool;

import java.util.Random;

public class ConnectionResource {
    public void work(){
        try {
            System.out.println("Now working " + Thread.currentThread().getName());
            Thread.sleep(new Random().nextInt(200));
            System.out.println("End working " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
