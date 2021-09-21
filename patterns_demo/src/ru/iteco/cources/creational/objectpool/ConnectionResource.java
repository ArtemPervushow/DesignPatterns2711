package ru.iteco.cources.creational.objectpool;

import java.util.Random;

public class ConnectionResource {
    private boolean isBlocked = true;

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public void work(){
        if (isBlocked) {
            System.out.println("Resource is blocked " + Thread.currentThread().getName());
        } else {
            try {
                System.out.println("Now working " + Thread.currentThread().getName());
                Thread.sleep(new Random().nextInt(2000));
                System.out.println("End working " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
