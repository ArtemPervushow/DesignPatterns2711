package ru.iteco.cources.structural.adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class FbAdapter implements SocialWeb {
    private FbSocialWeb fbSocialWeb;

    public FbAdapter(FbSocialWeb fbSocialWeb) {
        this.fbSocialWeb = fbSocialWeb;
    }

    @Override
    public List<String> getUserFriends(String userId) {
        Map<UUID, String> friendsMap =
                fbSocialWeb.getFriendsOfUser(UUID.fromString(userId));
        List<String> listOfFriends = new ArrayList<>();
        for (UUID key:
             friendsMap.keySet()) {
            listOfFriends.add(key.toString() + ":" +friendsMap.get(key));
        }
        return listOfFriends;
    }

    @Override
    public void postToWall(String userId, String wallPost) {
        fbSocialWeb.postToWall(wallPost, UUID.fromString(userId));
    }

    @Override
    public double appendMoneyToBalance(String userId, double money) {
        return fbSocialWeb.appendMoneyToBalance(UUID.fromString(userId), money);
    }
}
