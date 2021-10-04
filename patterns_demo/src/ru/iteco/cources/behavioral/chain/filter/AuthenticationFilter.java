package ru.iteco.cources.behavioral.chain.filter;

import java.util.Objects;

public class AuthenticationFilter extends Filter {

    public AuthenticationFilter(Request request, Filter next) {
        super(request, next);
    }

    @Override
    public boolean validate() {
        return Objects.nonNull(request.getAuthToken()) && proceed();
    }

}
