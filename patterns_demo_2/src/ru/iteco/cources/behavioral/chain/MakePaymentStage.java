package ru.iteco.cources.behavioral.chain;

public class MakePaymentStage extends PaymentStage {
    @Override
    public boolean checkPayment(Payment payment) {
        System.out.println("Making a payment " + payment);

        return true;
    }
}
