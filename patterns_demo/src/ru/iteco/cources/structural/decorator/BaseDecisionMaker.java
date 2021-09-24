package ru.iteco.cources.structural.decorator;

public class BaseDecisionMaker implements CreditDecision {
    @Override
    public int makeDecision(Client client) {
        if(client.getName().equals("Mavrodi")) {
            return -10000000;
        } else {
            return 0;
        }
    }
}
