package ru.iteco.cources.behavioral.chain;

public class Demo {
    public static void main(String[] args) {
        BusinessChecker businessChecker = new BusinessChecker(null);
        AuthorizationChecker authorizationChecker = new AuthorizationChecker(businessChecker);
        AuthChecker authChecker = new AuthChecker(authorizationChecker, "USER2");

        authChecker.check("USER2");
    }
}
