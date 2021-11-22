package ru.iteco.cources.behavioral.chain.filter;

public class ContextAwareRequestFilter extends Filter {

    private static final String DEFAULT_CONTEXT = "DEFAULT_CONTEXT";

    public ContextAwareRequestFilter(Request request, Filter next) {
        super(request, next);
    }

    @Override
    public boolean validate() {
        return Boolean.parseBoolean(request.getContext().get(DEFAULT_CONTEXT)) && proceed();
    }

}
