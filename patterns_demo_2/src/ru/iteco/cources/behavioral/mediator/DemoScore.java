package ru.iteco.cources.behavioral.mediator;

public class DemoScore {
    public static void main(String[] args) {
        MainScore score1 = new MainScore(100000f, "AAA", "Artem");
        CreditScore score2 = new CreditScore(1000f, "BBB", "Artem",1000f,5000f);
        DepositScore score3 = new DepositScore(100f, "CCC", "Artem", 10);

        ScoreMediator mediator = new ScoreMediatorImpl(score1, score2, score3);

        score2.withdrawMoney(1000f);
        score2.withdrawMoney(1000f);
        score2.withdrawMoney(1000f);
        score2.withdrawMoney(1000f);
        score2.withdrawMoney(1000f);
        score2.withdrawMoney(1000f);

        mediator.appendMoneyToMainScore(2000f);
        System.out.println(score1.sum);
        System.out.println(score2.sum);

        score3.depositMoney(15000f);
        mediator.growMoneyOnDeposit();
        System.out.println(score1.sum);
        System.out.println(score3.sum);
    }
}
