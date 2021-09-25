package ru.iteco.cources.structural.adapter;

import java.util.List;

public class VkAdapter implements SocialWeb {
    private VkSocialWeb vkSocialWeb;

    public VkAdapter(VkSocialWeb vkSocialWeb) {
        this.vkSocialWeb = vkSocialWeb;
    }

    @Override
    public List<String> getUserFriends(String userId) {
        return vkSocialWeb.getUserFriends(userId);
    }

    @Override
    public void postToWall(String userId, String wallPost) {
        vkSocialWeb.postToWall(userId, wallPost);
    }

    @Override
    public double appendMoneyToBalance(String userId, double money) {
        int votes = vkSocialWeb.convertMoneyToVotes(money, userId);
        return votes * 15;
    }
}
