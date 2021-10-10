package ru.iteco.cources.behavioral.strategy;

public class PayFromDebetStrategy implements PaymentStrategy {
    private UserScore userScore;

    public PayFromDebetStrategy(UserScore userScore) {
        this.userScore = userScore;
    }

    @Override
    public boolean pay(float sum) {
        if(userScore.widthdrawFromDebet(sum) > 0)
            return true;
        else
            return false;
    }
}
