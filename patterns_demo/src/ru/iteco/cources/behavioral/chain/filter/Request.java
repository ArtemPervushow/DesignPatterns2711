package ru.iteco.cources.behavioral.chain.filter;

import java.util.Map;

public interface Request {

    String getSession();

    String getProtocol();

    Map<String, String> getContext();

    void setContext(Map<String, String> context);

    AuthToken getAuthToken();

}
