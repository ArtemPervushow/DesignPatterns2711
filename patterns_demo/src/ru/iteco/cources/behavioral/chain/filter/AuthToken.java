package ru.iteco.cources.behavioral.chain.filter;

import java.util.List;

public interface AuthToken {

    String getType();

    boolean validate();

    List<String> getRoles();

}
