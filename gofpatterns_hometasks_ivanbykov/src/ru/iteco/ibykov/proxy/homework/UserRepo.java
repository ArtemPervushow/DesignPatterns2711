package ru.iteco.ibykov.proxy.homework;

import java.util.List;

public interface UserRepo {
    List<User> getAll();
    void changeUsers(List<User> users);
}
