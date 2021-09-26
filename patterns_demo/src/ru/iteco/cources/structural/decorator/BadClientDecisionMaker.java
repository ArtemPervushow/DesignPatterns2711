package ru.iteco.cources.structural.decorator;

public class BadClientDecisionMaker extends DecisionMaker {
    public BadClientDecisionMaker(CreditDecision wrappee) {
        super(wrappee);
    }

    @Override
    public int makeDecision(Client client) {
        int ourDecision = client.isBadClient() ? -1000 : 0;
        return ourDecision + super.makeDecision(client);
    }
}
