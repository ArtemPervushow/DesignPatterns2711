package ru.iteco.ibykov.proxy.homework;

import java.util.ArrayList;
import java.util.List;

public class UsersOver18Impl implements UserRepo {
    private List<User> source = new ArrayList<>();


    @Override
    public List<User> getAll() {
        List<User> res = new ArrayList<>();
        for (User user:
                source)
        {
            if(user.getAge() >18){
                res.add(user);
        }
        }
        return res;
    }
    @Override
    public void changeUsers(List<User> users) {
        for (User user:
                users) {
            if(!source.contains(user) && !user.getRole().equals("admin")) {
                source.add(user);
            }
        }
    }
}
