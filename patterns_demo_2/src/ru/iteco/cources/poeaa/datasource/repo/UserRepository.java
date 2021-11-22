package ru.iteco.cources.poeaa.datasource.repo;

import ru.iteco.cources.poeaa.datasource.model.Pasport;
import ru.iteco.cources.poeaa.datasource.model.User;

import java.util.List;
import java.util.UUID;

public interface UserRepository {
    //C
    boolean createUser(User user);
    int createBatchUsers(List<User> users);

    //R
    User getByUUID(UUID uuid);
    List<User> gelAll();
    List<User> getByFilter(String[] fields);// {"name", "Artem", "age", "31"}
    List<User> getByCondition(String[] conditions);// {"age", ">", "17"}

    //U
    boolean updateUser(User user);
    int updateBatchUsers(List<User> users);

    //D
    boolean deleteUser(User user);
    int deleteBatchUsers(List<User> users);

    //D+
    int deleteUsersByFilter(String[] fields);
    int deleteUsersByCondition(String[] conditions);

    //Additional
    User getUserByName(String name);

    Pasport getUserPasport(User user);

    User getUserWhyOwnsProduct(String productName);
}
