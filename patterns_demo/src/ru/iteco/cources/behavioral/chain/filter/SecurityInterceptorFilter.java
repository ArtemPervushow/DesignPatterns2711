package ru.iteco.cources.behavioral.chain.filter;

public class SecurityInterceptorFilter extends Filter {

    public SecurityInterceptorFilter(Request request, Filter next) {
        super(request, next);
    }

    @Override
    public boolean validate() {
        return request.getAuthToken().getRoles().contains("ADMIN") && proceed();
    }

}
