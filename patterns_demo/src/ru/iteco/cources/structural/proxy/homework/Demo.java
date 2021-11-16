package ru.iteco.cources.structural.proxy.homework;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        UserRepo proxy = new ProxyUserRepo(new UserRepoImpl());

        User user1 = new User("man 1", 31, "admin@");
        User user2 = new User("man 2", 16, "student");
        User user3 = new User("man 3", 45, "teacher");
        User user4 = new User("man 4", 53, "teacher");
        User user5 = new User("man 4", 53, "teacher");

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        proxy.changeUsers(users);

        List<User> userList =  proxy.getAll();
        for (User user : userList) {
            System.out.println("name = " + user.getName() + ", age = " + user.getAge() + ", " + user.getRole());
        }
    }
}
