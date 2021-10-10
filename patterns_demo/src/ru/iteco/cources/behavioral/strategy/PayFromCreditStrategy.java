package ru.iteco.cources.behavioral.strategy;

public class PayFromCreditStrategy implements PaymentStrategy {
    private UserScore userScore;

    public PayFromCreditStrategy(UserScore userScore) {
        this.userScore = userScore;
    }

    @Override
    public boolean pay(float sum) {
        if(userScore.widthdrawFromCredit(sum) > 0)
            return true;
        else
            return false;
    }
}
