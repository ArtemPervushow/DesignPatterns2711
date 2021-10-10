package ru.iteco.cources.behavioral.strategy;

public class PayByCashStrategy implements PaymentStrategy {
    private UserScore userScore;

    public PayByCashStrategy(UserScore userScore) {
        this.userScore = userScore;
    }

    @Override
    public boolean pay(float sum) {
        if(userScore.widthdrawFromCash(sum) > 0) {
            return true;
        } else {
            return false;
        }
    }
}
