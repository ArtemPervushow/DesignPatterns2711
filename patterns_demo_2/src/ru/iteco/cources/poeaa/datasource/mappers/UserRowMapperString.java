package ru.iteco.cources.poeaa.datasource.mappers;

import ru.iteco.cources.poeaa.datasource.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserRowMapperString implements UserRowMapper {
    @Override
    public User getUserFromSource(Object source) {
        //parse code for user. Перемапить все поля из строки
        return new User(UUID.randomUUID(), "artem", true, (short) 31);
    }

    @Override
    public Object getSourceFromUser(User user) {
        return user.toString();
    }

    @Override
    public List<User> getUsersFromSources(List<Object> sources) {
        ArrayList<User> users = new ArrayList<>();

        for (Object source:
             sources) {
            users.add(getUserFromSource(source));
        }

        return users;
    }

    @Override
    public List<Object> getSourcesFromUsers(List<User> users) {
        List<Object> sources = new ArrayList<>();

        for (User user:
             users) {
            sources.add(getSourceFromUser(user));
        }

        return sources;
    }

    @Override
    public String getSelectQuery(User user) {
        return "select query based on user param fields";
    }

    @Override
    public String getInsertQuery(User user) {
        return "insert query based on user param fields";
    }

    @Override
    public String getUpdateQuery(User user) {
        return "update query based on user param fields";
    }
}
