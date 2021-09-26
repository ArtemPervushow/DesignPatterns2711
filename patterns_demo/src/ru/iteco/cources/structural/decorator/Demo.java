package ru.iteco.cources.structural.decorator;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        CreditDecision zero = new BaseDecisionMaker();
        DecisionMaker first = new BadClientDecisionMaker(zero);
        DecisionMaker second = new IncomeDecisionMaker(first);
        DecisionMaker third = new HistoryDecisionMaker(second);

        Client client = new Client("Artem",
                            3000000f,
                Arrays.asList(true, true, false), new ArrayList<>(), false);

        System.out.println(third.makeDecision(client));
    }
}
