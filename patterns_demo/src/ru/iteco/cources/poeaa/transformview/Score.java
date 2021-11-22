package ru.iteco.cources.poeaa.transformview;

public class Score {
    private float balance;
    private String number;
    private String owner;

    public Score(float balance, String number, String owner) {
        this.balance = balance;
        this.number = number;
        this.owner = owner;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
