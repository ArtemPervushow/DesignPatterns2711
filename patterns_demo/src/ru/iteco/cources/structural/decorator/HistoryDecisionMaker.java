package ru.iteco.cources.structural.decorator;

public class HistoryDecisionMaker extends DecisionMaker {
    public HistoryDecisionMaker(CreditDecision wrappee) {
        super(wrappee);
    }

    @Override
    public int makeDecision(Client client) {
        int succes = 0;
        int fallen = 0;

        for (boolean successCredit :
                client.getHistoryOfSuccessCredits()) {
            if (successCredit)
                succes++;
            else
                fallen++;
        }

        int ourDecision = (succes - fallen) * 1000;
        return ourDecision + super.makeDecision(client);
    }
}
