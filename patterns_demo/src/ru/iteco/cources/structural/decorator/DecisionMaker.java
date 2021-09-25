package ru.iteco.cources.structural.decorator;

public abstract class DecisionMaker implements CreditDecision{
    private CreditDecision wrappee;

    public DecisionMaker(CreditDecision wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public int makeDecision(Client client) {
        if(wrappee != null) {
            return wrappee.makeDecision(client);
        } else {
            return 0;
        }
    }
}
