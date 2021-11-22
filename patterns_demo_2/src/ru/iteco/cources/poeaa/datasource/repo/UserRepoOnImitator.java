package ru.iteco.cources.poeaa.datasource.repo;

import ru.iteco.cources.poeaa.datasource.DbImitator;
import ru.iteco.cources.poeaa.datasource.mappers.UserRowMapper;
import ru.iteco.cources.poeaa.datasource.mappers.UserRowMapperString;
import ru.iteco.cources.poeaa.datasource.model.Pasport;
import ru.iteco.cources.poeaa.datasource.model.User;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class UserRepoOnImitator implements UserRepository {
    private DbImitator dbImitator = new DbImitator();
    private UserRowMapper mapper = new UserRowMapperString();

    @Override
    public boolean createUser(User user) {
        return dbImitator.insertSomeUsingSQL(mapper.getInsertQuery(user));
    }

    @Override
    public int createBatchUsers(List<User> users) {
        return 0;
    }

    @Override
    public User getByUUID(UUID uuid) {
        String rawResult = dbImitator.getEntityUsingSQL("select user based on uuid");

        User user = mapper.getUserFromSource(rawResult);

        return user;
    }

    @Override
    public List<User> gelAll() {
        List<Object> rawResult = Collections.singletonList(dbImitator.getEntityListUsingSQL("get all query"));
        List<User> userList = mapper.getUsersFromSources(rawResult);

        return userList;
    }

    @Override
    public List<User> getByFilter(String[] fields) {
        return null;
    }

    @Override
    public List<User> getByCondition(String[] conditions) {
        return null;
    }

    @Override
    public boolean updateUser(User user) {
        return false;
    }

    @Override
    public int updateBatchUsers(List<User> users) {
        return 0;
    }

    @Override
    public boolean deleteUser(User user) {
        return false;
    }

    @Override
    public int deleteBatchUsers(List<User> users) {
        return 0;
    }

    @Override
    public int deleteUsersByFilter(String[] fields) {
        return 0;
    }

    @Override
    public int deleteUsersByCondition(String[] conditions) {
        return 0;
    }

    @Override
    public User getUserByName(String name) {
        return null;
    }

    @Override
    public Pasport getUserPasport(User user) {
        return null;
    }

    @Override
    public User getUserWhyOwnsProduct(String productName) {
        return null;
    }
}
