package ru.iteco.cources.structural.proxy.homework;

import java.util.List;
import java.util.stream.Collectors;

public class AdultUserRepo implements UserRepo {

    private final UserRepo userRepo;

    public AdultUserRepo(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public List<User> getAll() {
        return userRepo.getAll().stream().filter(u -> u.getAge() > 18).collect(Collectors.toList());
    }

    @Override
    public void changeUsers(List<User> users) {
        userRepo.changeUsers(users.stream().filter(u -> !u.getRole().equals("admin@")).collect(Collectors.toList()));
    }

}
