package ru.iteco.cources.poeaa.locks.implicit.timeout;

public class Customer {
    private long id;
    private String fio;
    private float balance;

    public Customer(long id, String fio, float balance) {
        this.id = id;
        this.fio = fio;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", fio='" + fio + '\'' +
                ", balance=" + balance +
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
