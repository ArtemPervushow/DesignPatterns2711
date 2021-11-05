package ru.iteco.cources.behavioral.chain.filter;

public class StoredAuthenticationFilter extends Filter {

    public StoredAuthenticationFilter(Request request, Filter next) {
        super(request, next);
    }

    @Override
    public boolean validate() {
        return request.getAuthToken().validate() && proceed();
    }

}
