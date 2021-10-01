package ru.iteco.cources.behavioral.chain;

public class Demo {
    public static void main(String[] args) {
        PaymentStage stage1 = new AuthClientStage();
        PaymentStage stage2 = new CheckBalanceStage(10000);
        PaymentStage stage3 = new MakePaymentStage();

        stage1.setPaymentStage(stage2);
        stage2.setPaymentStage(stage3);

        stage1.checkPayment(new Payment("USER1", 1100f, "", ""));
    }
}
