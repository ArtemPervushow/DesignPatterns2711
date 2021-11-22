package ru.iteco.cources.structural.proxy.homework;

import java.util.List;
import java.util.stream.Collectors;

public class FullAgedUserRepo implements UserRepo {

    private static final int AGE_OF_MAJORITY = 18;
    private static final String ADMIN_ROLE = "admin@";

    private final UserRepo userRepo;

    public FullAgedUserRepo(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public List<User> getAll() {
        return userRepo.getAll().stream()
                .filter(user -> user.getAge() > AGE_OF_MAJORITY)
                .collect(Collectors.toList());
    }

    @Override
    public void changeUsers(List<User> users) {
        userRepo.changeUsers(users.stream()
                .filter(user -> !ADMIN_ROLE.equals(user.getRole()))
                .collect(Collectors.toList()));
    }

}
