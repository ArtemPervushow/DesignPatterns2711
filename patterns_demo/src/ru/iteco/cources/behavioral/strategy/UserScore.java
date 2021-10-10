package ru.iteco.cources.behavioral.strategy;

public class UserScore {
    private float cashBalance;
    private float debetBalance;
    private float creditBalance;

    public UserScore(float cashBalance, float debetBalance, float creditBalance) {
        this.cashBalance = cashBalance;
        this.debetBalance = debetBalance;
        this.creditBalance = creditBalance;
    }

    public float getCashBalance() {
        return cashBalance;
    }

    public void setCashBalance(float cashBalance) {
        this.cashBalance = cashBalance;
    }

    public float widthdrawFromCash(float sum) {
        cashBalance -= sum;
        return cashBalance;
    }

    public float getDebetBalance() {
        return debetBalance;
    }

    public void setDebetBalance(float debetBalance) {
        this.debetBalance = debetBalance;
    }

    public float widthdrawFromDebet(float sum) {
        debetBalance -= sum;
        return debetBalance;
    }

    public float getCreditBalance() {
        return creditBalance;
    }

    public void setCreditBalance(float creditBalance) {
        this.creditBalance = creditBalance;
    }

    public float widthdrawFromCredit(float sum) {
        creditBalance -= sum;
        return creditBalance;
    }
}
