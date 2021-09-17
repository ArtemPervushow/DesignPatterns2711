package ru.iteco.cources.structural.adapter;

import java.util.*;

public class FbSocialWeb {
    public long getCountOfFriends(UUID uuid){
        System.out.println("Searching the friend of " + uuid.toString() + " in FB");
        return new Random().nextInt(1000);
    }

    public Map<String, String> getWallPosts(UUID uuid) {
        System.out.println("Computing walls in FB for user " + uuid);

        Map<String, String> wallMap =  new HashMap<>();
        wallMap.put("post 1", "Hello everybody");
        wallMap.put("post 2", "Bye everybody");

        return wallMap;
    }

    public void addMoneyToScore(UUID uuid, double sumOfMoney){
        System.out.println("Added new money to FB score");
    }
}
