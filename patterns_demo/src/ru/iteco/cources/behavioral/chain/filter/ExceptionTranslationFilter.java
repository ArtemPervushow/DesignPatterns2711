package ru.iteco.cources.behavioral.chain.filter;

public class ExceptionTranslationFilter extends Filter {

    public ExceptionTranslationFilter(Request request, Filter next) {
        super(request, next);
    }

    @Override
    public boolean validate() {
        return request.getContext().get("Exception") != null && proceed();
    }

}
