package ru.iteco.cources.behavioral.chain.filter;

public class ContextAwareRequestFilter extends Filter {

    public ContextAwareRequestFilter(Request request, Filter next) {
        super(request, next);
    }

    @Override
    public boolean validate() {
        return Boolean.parseBoolean(request.getContext().get("HAS_CONTEXT")) && proceed();
    }

}
