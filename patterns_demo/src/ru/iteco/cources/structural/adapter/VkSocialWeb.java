package ru.iteco.cources.structural.adapter;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class VkSocialWeb {
    public int getCountOfFriends(String id){
        System.out.println("Searching the friend of " + id + " in VK");
        return new Random().nextInt(1000);
    }

    public List<String> getWallPosts(String userId) {
        System.out.println("Computing walls in Vk for user " + userId);

        return Arrays.asList("Hi", "Ololo");
    }

    public void addVotesToScore(String userId, int countOfVoices){
        System.out.println("Added new voices to vk score");
    }
}
