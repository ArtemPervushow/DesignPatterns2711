package ru.iteco.cources.poeaa.datasource.mappers;

import ru.iteco.cources.poeaa.datasource.model.User;

import java.util.List;

public interface UserRowMapper {
    User getUserFromSource(Object source);
    Object getSourceFromUser(User user);

    //not necessary
    List<User> getUsersFromSources(List<Object> sources);
    List<Object> getSourcesFromUsers(List<User> users);
    String getSelectQuery(User user);
    String getInsertQuery(User user);
    String getUpdateQuery(User user);
}
