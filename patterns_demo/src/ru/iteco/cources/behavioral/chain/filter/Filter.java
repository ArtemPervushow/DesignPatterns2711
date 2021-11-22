package ru.iteco.cources.behavioral.chain.filter;

public abstract class Filter {

    protected final Request request;
    private final Filter nextFilter;

    public Filter(Request request, Filter nextFilter) {
        this.request = request;
        this.nextFilter = nextFilter;
    }

    public abstract boolean validate();

    protected boolean proceed() {
        return nextFilter == null || nextFilter.validate();
    }

}
