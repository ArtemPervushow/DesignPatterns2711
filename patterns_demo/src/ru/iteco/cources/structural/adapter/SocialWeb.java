package ru.iteco.cources.structural.adapter;

import java.util.List;

public interface SocialWeb {
    long getCountOfFriends(String userId);
    List<String> getWallPosts(String userId);
    void addMoney(String userId, double sumOfMoney);
}
