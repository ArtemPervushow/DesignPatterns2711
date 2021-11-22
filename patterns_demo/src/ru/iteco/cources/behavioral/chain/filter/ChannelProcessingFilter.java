package ru.iteco.cources.behavioral.chain.filter;

public class ChannelProcessingFilter extends Filter {

    public ChannelProcessingFilter(Request request, Filter next) {
        super(request, next);
    }

    @Override
    public boolean validate() {
        return request.getProtocol().equals("https") && proceed();
    }

}
