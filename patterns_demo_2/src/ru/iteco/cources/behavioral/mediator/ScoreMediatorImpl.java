package ru.iteco.cources.behavioral.mediator;

public class ScoreMediatorImpl implements ScoreMediator {
    private MainScore mainScore;
    private CreditScore creditScore;
    private DepositScore depositScore;

    public ScoreMediatorImpl(MainScore mainScore, CreditScore creditScore, DepositScore depositScore) {
        this.mainScore = mainScore;
        this.creditScore = creditScore;
        this.depositScore = depositScore;
    }

    @Override
    public void appendMoneyToMainScore(float sum) {
        if(creditScore.isBlockedByLoan()) {
            System.out.println("Using your money to close credit!");
            creditScore.depositMoney(sum);
            if(creditScore.sum < 0) {
                mainScore.depositMoney(creditScore.sum * -1);
                creditScore.depositMoney(creditScore.sum);
            }
            return;
        }

        mainScore.depositMoney(sum);
    }

    @Override
    public void growMoneyOnDeposit() {
        depositScore.growMoneyUsingPercent();
        if(depositScore.sum > 10000) {
            mainScore.depositMoney(5000);
            depositScore.withdrawMoney(5000);
        }
    }

    @Override
    public void appendMoneyToMainScore(float sum, float sum2) {

    }
}
