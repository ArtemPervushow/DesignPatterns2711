package ru.iteco.cources.behavioral.mediator;

public class MainScore extends Score{
    public MainScore(float sum, String number, String owner) {
        super(sum, number, owner);
    }

    @Override
    public void depositMoney(float money) {
        sum+=money;
    }

    @Override
    public void withdrawMoney(float money) {
        sum-=money;
    }

    @Override
    public String toString() {
        return "MainScore{" +
                "sum=" + sum +
                '}';
    }

    @Override
    public String getScoreInfo() {
        return toString();
    }
}
