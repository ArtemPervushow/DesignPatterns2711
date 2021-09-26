package ru.iteco.cources.structural.decorator;

public class IncomeDecisionMaker extends DecisionMaker {
    public IncomeDecisionMaker(CreditDecision wrappee) {
        super(wrappee);
    }

    @Override
    public int makeDecision(Client client) {
        return (int) (client.getIncome() / 1000 + super.makeDecision(client));
    }
}
