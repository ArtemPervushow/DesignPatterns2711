package ru.iteco.cources.behavioral.chain;

public class AuthClientStage extends PaymentStage {
    @Override
    public boolean checkPayment(Payment payment) {
        if(payment.getPayeer().equals("USER1")) {
            payment.appendInfo("Auth confirmed ");

            return super.checkNextPayment(payment);
        }

        System.out.println("Auth failed!");
        return false;
    }
}
