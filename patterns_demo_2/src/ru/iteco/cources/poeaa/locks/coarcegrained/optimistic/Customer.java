package ru.iteco.cources.poeaa.locks.coarcegrained.optimistic;

import java.util.ArrayList;

public class Customer {
    private long id;
    private String fio;
    private float balance;
    private ArrayList<Address> addresses = new ArrayList<>();
    private long version;

    public Customer(long id, String fio, float balance) {
        this.id = id;
        this.fio = fio;
        this.balance = balance;
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public long getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", fio='" + fio + '\'' +
                ", balance=" + balance +
                ", addresses=" + addresses +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
