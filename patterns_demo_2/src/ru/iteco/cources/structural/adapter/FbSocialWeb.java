package ru.iteco.cources.structural.adapter;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class FbSocialWeb {
    public Map<UUID, String> getFriendsOfUser(UUID uuid) {
        Map<UUID, String> friends = new HashMap<>();
        friends.put(UUID.randomUUID(), "Alex");
        friends.put(UUID.randomUUID(), "Boris");

        return friends;
    }

    public void postToWall(String post, UUID userID) {
        System.out.println(post + " posted to wall of user " + userID.toString());
    }

    public double appendMoneyToBalance(UUID userId, double money) {
        return money - 100;
    }
}
