package ru.iteco.cources.poeaa.locks.coarcegrained;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private long id;
    private String name;
    private float balance;
    private List<Address> addresses = new ArrayList<>();

    public Customer(long id, String name, float balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
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
