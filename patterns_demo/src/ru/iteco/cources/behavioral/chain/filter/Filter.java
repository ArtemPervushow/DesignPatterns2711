package ru.iteco.cources.behavioral.chain.filter;

import java.util.Objects;

public abstract class Filter {

    protected final Request request;
    private final Filter next;

    public Filter(Request request, Filter next) {
        this.request = request;
        this.next = next;
    }

    public abstract boolean validate();

    protected boolean proceed() {
        return Objects.isNull(next) || next.validate();
    }

}
