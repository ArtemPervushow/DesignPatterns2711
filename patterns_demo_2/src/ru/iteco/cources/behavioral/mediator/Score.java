package ru.iteco.cources.behavioral.mediator;

public abstract class Score {
    protected float sum;
    private String number;
    private String owner;

    public Score(float sum, String number, String owner) {
        this.sum = sum;
        this.number = number;
        this.owner = owner;
    }

    public abstract void depositMoney(float money);
    public abstract void withdrawMoney(float money);

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
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

    public abstract String getScoreInfo();
}
