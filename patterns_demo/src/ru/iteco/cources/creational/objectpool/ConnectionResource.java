package ru.iteco.cources.creational.objectpool;

import java.util.Random;

public class ConnectionResource {
    private boolean blocked;

    public void work(){
        try {
            System.out.println("Now working " + Thread.currentThread().getName());
            Thread.sleep(new Random().nextInt(2000));
            System.out.println("End working " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }
}
