package ru.iteco.ibykov.proxy.homework;

import java.util.ArrayList;
import java.util.List;

public class UserRepoImpl implements UserRepo {
    private List<User> source = new ArrayList<>();

    @Override
    public List<User> getAll() {
        return source;
    }

    @Override
    public void changeUsers(List<User> users) {
        for (User user:
             users) {
            if(!source.contains(user)) {
                source.add(user);
            }
        }
    }
}
