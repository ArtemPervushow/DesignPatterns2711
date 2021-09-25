package ru.iteco.cources.structural.proxy.base;

public class CreditCardAsProxy implements PaymentAgent {
    private Cash cash;
    private float creditBalance;

    public CreditCardAsProxy(Cash cash) {
        this.cash = cash;
    }

    @Override
    public float makePayment(float sum) throws Exception {
        System.out.println("Trying to make payment using credit card");

        float result = cash.makePayment(sum);

        creditBalance += sum;
        System.out.println("You use credit money for " + creditBalance);

        return result;
    }
}
