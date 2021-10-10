package ru.iteco.cources.behavioral.mediator;

public class DepositScore extends Score{
    private float percent;

    public DepositScore(float sum, String number, String owner, float percent) {
        super(sum, number, owner);
        this.percent = percent;
    }

    @Override
    public void depositMoney(float money) {
        sum += money;
    }

    @Override
    public void withdrawMoney(float money) {
        sum -= money;
    }

    public void growMoneyUsingPercent(){
        sum *= 1 + percent/100;
    }

    @Override
    public String toString() {
        return "DepositScore{" +
                "percent=" + percent +
                ", sum=" + sum +
                '}';
    }

    @Override
    public String getScoreInfo() {
        return toString();
    }
}
