package ru.iteco.cources.poeaa.pagecontroller.view;

import ru.iteco.cources.poeaa.pagecontroller.model.User;

public class UserView {
    public void showUser(User user){
        System.out.println(user.getName());
        System.out.println(user.getAge());
        System.out.println(user.isSex());
    }
}
