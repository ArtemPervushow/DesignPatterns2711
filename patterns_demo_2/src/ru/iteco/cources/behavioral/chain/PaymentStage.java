package ru.iteco.cources.behavioral.chain;

public abstract class PaymentStage {
    private PaymentStage paymentStage;

    public void setPaymentStage(PaymentStage paymentStage) {
        this.paymentStage = paymentStage;
    }

    public abstract boolean checkPayment(Payment payment);

    protected boolean checkNextPayment(Payment payment) {
        if(paymentStage == null) {
            return true;
        }

        return paymentStage.checkPayment(payment);
    }
}
