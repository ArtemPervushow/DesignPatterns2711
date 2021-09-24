package ru.iteco.cources.structural.proxy.base;

public class Cash implements Payment {
    private float balance;

    public Cash(float balance) {
        this.balance = balance;
    }

    @Override
    public float makePayment(float sum) throws Exception {
        if(sum > 0) {
            if(balance - sum >= 0) {
                return balance - sum;
            } else {
                throw new Exception("Not enought money");
            }
        } else {
            throw new Exception("Negative sum");
        }
    }
}
