package ru.iteco.cources.behavioral.chain.filter;

public class ConcurrentSessionFilter extends Filter {

    public ConcurrentSessionFilter(Request request, Filter next) {
        super(request, next);
    }

    @Override
    public boolean validate() {
        return request.getSession() != null && proceed();
    }

}
