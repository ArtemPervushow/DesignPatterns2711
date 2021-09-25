package ru.iteco.cources.structural.adapter;

import java.util.List;

public class VkSocialWebAdapter implements SocialWeb {
    private VkSocialWeb vkSocialWeb;
    private float voteRate = 15l;

    public VkSocialWebAdapter(VkSocialWeb vkSocialWeb) {
        this.vkSocialWeb = vkSocialWeb;
    }

    @Override
    public long getCountOfFriends(String userId) {
        return (long) vkSocialWeb.getCountOfFriends(userId);
    }

    @Override
    public List<String> getWallPosts(String userId) {
        return vkSocialWeb.getWallPosts(userId);
    }

    @Override
    public void addMoney(String userId, double sumOfMoney) {
        vkSocialWeb.addVotesToScore(userId, (int) (sumOfMoney * voteRate));
    }
}
