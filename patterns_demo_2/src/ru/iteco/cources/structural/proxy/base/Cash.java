package ru.iteco.cources.structural.proxy.base;

public class Cash implements PaymentAgent {
    private float balance;

    public Cash(float balance) {
        this.balance = balance;
    }

    @Override
    public float makePayment(float sum) throws Exception {
        if(sum > 0 && balance - sum >= 0) {
            balance -= sum;
            return balance;
        } else {
            throw new Exception("Wrong sum");
        }
    }
}
