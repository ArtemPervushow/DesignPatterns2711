package ru.iteco.cources.behavioral.chain.filter;

public class SecurityInterceptorFilter extends Filter {

    private static final String DEFAULT_ROLE = "DEFAULT_ROLE";

    public SecurityInterceptorFilter(Request request, Filter next) {
        super(request, next);
    }

    @Override
    public boolean validate() {
        return request.getAuthToken().getRoles().contains(DEFAULT_ROLE) && proceed();
    }

}
