package ru.iteco.cources.behavioral.chain;

public class BusinessChecker extends Checker {
    public BusinessChecker(Checker next) {
        super(next);
    }

    @Override
    public boolean check(Object data) {
        System.out.println("Here is bussiness action from user " + data);

        return checkNext(data);
    }
}
