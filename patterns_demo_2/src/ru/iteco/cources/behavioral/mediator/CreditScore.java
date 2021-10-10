package ru.iteco.cources.behavioral.mediator;

public class CreditScore extends Score {
    private float creditLoan;
    private float limit;
    private boolean isBlockedByLoan = false;

    public CreditScore(float sum, String number, String owner, float creditLoan, float limit) {
        super(sum, number, owner);
        this.creditLoan = creditLoan;
        this.limit = limit;
    }

    @Override
    public void depositMoney(float money) {
        creditLoan -= money;
        if(creditLoan < limit) {
            isBlockedByLoan = false;
        }
    }

    @Override
    public void withdrawMoney(float money) {
        if(!isBlockedByLoan && creditLoan + money <= limit) {
            creditLoan += money;
            if(creditLoan >= limit) {
                isBlockedByLoan = true;
            }
        }
    }

    @Override
    public String toString() {
        return "CreditScore{" +
                "creditLoan=" + creditLoan +
                ", limit=" + limit +
                ", isBlockedByLoan=" + isBlockedByLoan +
                '}';
    }

    @Override
    public String getScoreInfo() {
        return "Score info " + toString();
    }

    public boolean isBlockedByLoan() {
        return isBlockedByLoan;
    }
}
