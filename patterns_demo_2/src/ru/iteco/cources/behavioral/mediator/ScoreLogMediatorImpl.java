package ru.iteco.cources.behavioral.mediator;

public class ScoreLogMediatorImpl implements ScoreLogMediator {
    private MainScore mainScore;
    private CreditScore creditScore;
    private DepositScore depositScore;

    public ScoreLogMediatorImpl(MainScore mainScore, CreditScore creditScore, DepositScore depositScore) {
        this.mainScore = mainScore;
        this.creditScore = creditScore;
        this.depositScore = depositScore;
    }

    @Override
    public void logMainScoreInfo() {
        System.out.println(mainScore.getScoreInfo());
        System.out.println(creditScore.getScoreInfo());
        System.out.println(depositScore.getScoreInfo());
    }
}
