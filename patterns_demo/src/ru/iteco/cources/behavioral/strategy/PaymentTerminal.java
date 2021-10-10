package ru.iteco.cources.behavioral.strategy;

public class PaymentTerminal {
    private UserScore userScore;
    private PaymentStrategy currentStrategy;

    public PaymentTerminal(UserScore userScore, PaymentStrategy currentStrategy) {
        this.userScore = userScore;
        this.currentStrategy = currentStrategy;
    }

    public void pay(float sum) {
        currentStrategy.pay(sum);
    }

    public void setCurrentStrategy(PaymentStrategy currentStrategy) {
        this.currentStrategy = currentStrategy;
    }

    public void payAccordingSituation(float sum) {
        if(userScore.getCashBalance() > 1000) {
            currentStrategy = new PayByCashStrategy(userScore);
        } else if(userScore.getDebetBalance() > 1000) {
            currentStrategy = new PayFromDebetStrategy(userScore);
        } else {
            currentStrategy = new PayFromCreditStrategy(userScore);
        }

        currentStrategy.pay(sum);
    }
}
