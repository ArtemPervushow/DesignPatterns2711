package ru.iteco.cources.behavioral.chain;

public class AuthChecker extends Checker {
    private String correctUser;

    public AuthChecker(Checker next, String correctUser) {
        super(next);
        this.correctUser = correctUser;
    }

    public AuthChecker(Checker next) {
        super(next);
    }

    @Override
    public boolean check(Object data) {
        System.out.println("Authentication check");
        if(!data.toString().equals(correctUser)) {
            return false;
        }

        return checkNext(data);
    }
}
