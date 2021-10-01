package ru.iteco.cources.behavioral.chain;

public abstract class Checker {
    private Checker next;

    public Checker(Checker next) {
        this.next = next;
    }

    public abstract boolean check(Object data);

    protected boolean checkNext(Object data) {
        if(next == null) {
            return true;
        }

        return next.check(data);
    }
}
