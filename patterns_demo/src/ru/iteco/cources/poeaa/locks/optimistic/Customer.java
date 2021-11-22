package ru.iteco.cources.poeaa.locks.optimistic;

import java.util.Random;

public class Customer {
    private long id;
    private String name;
    private float balance;
    private long version = 0;
    private Random random = new Random();

    public void setVersion(long version) {
        this.version = version;
    }

    public Customer(long id, String name, float balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void updateVersion(){
        version += random.nextInt(10000);
        if(version == Long.MAX_VALUE) {
            version = 1 + random.nextInt(10000);
        }
    }

    public long getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
