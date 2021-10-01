package ru.iteco.cources.behavioral.chain;

public class CheckBalanceStage extends PaymentStage {
    private float balance;

    public CheckBalanceStage(float balance) {
        this.balance = balance;
    }

    @Override
    public boolean checkPayment(Payment payment) {
        if(payment.getSum() <= balance) {
            payment.appendInfo("Balance enought ");

            return super.checkNextPayment(payment);
        }

        System.out.println("Balance failed!");
        return false;
    }
}
