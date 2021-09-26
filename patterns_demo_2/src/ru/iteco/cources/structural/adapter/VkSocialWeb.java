package ru.iteco.cources.structural.adapter;

import java.util.Arrays;
import java.util.List;

public class VkSocialWeb {
    public List<String> getUserFriends(String userId) {
        return Arrays.asList("Artem", "Serg", "Alex");
    }

    public void postToWall(String userId, String wallPost) {
        System.out.println(wallPost + " posted to wall of user " + userId);
    }

    public int convertMoneyToVotes(double money, String userId) {
        return (int) (money * 15);
    }
}
