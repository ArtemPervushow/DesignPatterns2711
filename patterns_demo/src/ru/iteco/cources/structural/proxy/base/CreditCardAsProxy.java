package ru.iteco.cources.structural.proxy.base;

public class CreditCardAsProxy implements Payment {
    private Cash cash;
    private float creditBalance;

    public CreditCardAsProxy(Cash cash) {
        this.cash = cash;
    }

    public void setCreditBalance(float creditBalance) {
        this.creditBalance = creditBalance;
    }

    @Override
    public float makePayment(float sum) throws Exception {
        float amountCash  = cash.makePayment(sum);
        this.creditBalance -= sum;//!!!!!! Additional logic

        return amountCash;
    }
}
