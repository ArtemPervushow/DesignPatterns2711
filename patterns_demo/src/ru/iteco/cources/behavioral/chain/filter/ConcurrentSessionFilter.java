package ru.iteco.cources.behavioral.chain.filter;

import java.util.Objects;

public class ConcurrentSessionFilter extends Filter {

    public ConcurrentSessionFilter(Request request, Filter next) {
        super(request, next);
    }

    @Override
    public boolean validate() {
        return Objects.nonNull(request.getSession()) && proceed();
    }

}
