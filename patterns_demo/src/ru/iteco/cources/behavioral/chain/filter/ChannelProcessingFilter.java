package ru.iteco.cources.behavioral.chain.filter;

public class ChannelProcessingFilter extends Filter {

    private static final String HTTPS_PROTOCOL = "https";

    public ChannelProcessingFilter(Request request, Filter next) {
        super(request, next);
    }

    @Override
    public boolean validate() {
        return request.getProtocol().equals(HTTPS_PROTOCOL) && proceed();
    }

}
