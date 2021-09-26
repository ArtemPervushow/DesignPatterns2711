package ru.iteco.cources.structural.proxy.homework;

import java.util.List;
import java.util.stream.Collectors;

public class ProxyUserRepo implements UserRepo {

    private UserRepo userRepo;

    public ProxyUserRepo(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public List<User> getAll() {
       return userRepo.getAll().stream().filter(p -> p.getAge() > 18).collect(Collectors.toList());
    }

    @Override
    public void changeUsers(List<User> userList) {
        userRepo.changeUsers(userList.stream().filter(p -> p.getRole() != "admin@").collect(Collectors.toList()));
    }
}
