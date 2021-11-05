package ru.iteco.cources.behavioral.chain.filter;

public class AuthenticationFilter extends Filter {

    public AuthenticationFilter(Request request, Filter next) {
        super(request, next);
    }

    @Override
    public boolean validate() {
        return request.getAuthToken() != null && proceed();
    }

}
