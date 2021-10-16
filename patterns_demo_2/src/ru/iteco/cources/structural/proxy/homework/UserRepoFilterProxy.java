package ru.iteco.cources.structural.proxy.homework;

import java.util.ArrayList;
import java.util.List;

public class UserRepoFilterProxy implements UserRepo {
    private final UserRepo userRepo;

    public UserRepoFilterProxy(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public List<User> getAll() {
        List<User> adults = new ArrayList<>();
        for (User user : userRepo.getAll()) {
            if (user.getAge() > 18) {
                adults.add(user);
            }
        }
        return adults;
    }

    @Override
    public void changeUsers(List<User> users) {
        List<User> admins = new ArrayList<>();
        for (User user : users) {
            if ("admin@".equals(user.getRole())) {
                admins.add(user);
            }
        }
        userRepo.changeUsers(admins);
    }
}
