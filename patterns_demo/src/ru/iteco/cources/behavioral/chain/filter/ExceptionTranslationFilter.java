package ru.iteco.cources.behavioral.chain.filter;

import java.util.Objects;

public class ExceptionTranslationFilter extends Filter {

    public ExceptionTranslationFilter(Request request, Filter next) {
        super(request, next);
    }

    @Override
    public boolean validate() {
        return Objects.nonNull(request.getContext().get("Exception")) && proceed();
    }

}
