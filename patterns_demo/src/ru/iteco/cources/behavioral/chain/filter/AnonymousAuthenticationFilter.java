package ru.iteco.cources.behavioral.chain.filter;

public class AnonymousAuthenticationFilter extends Filter {

    public AnonymousAuthenticationFilter(Request request, Filter next) {
        super(request, next);
    }

    @Override
    public boolean validate() {
        return request.getAuthToken().validate() && proceed();
    }

}
