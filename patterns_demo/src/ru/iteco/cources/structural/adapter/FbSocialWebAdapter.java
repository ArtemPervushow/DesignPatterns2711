package ru.iteco.cources.structural.adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class FbSocialWebAdapter implements SocialWeb {
    private FbSocialWeb fbSocialWeb;

    public FbSocialWebAdapter(FbSocialWeb fbSocialWeb) {
        this.fbSocialWeb = fbSocialWeb;
    }

    @Override
    public long getCountOfFriends(String userId) {
        return fbSocialWeb.getCountOfFriends(UUID.fromString(userId));
    }

    @Override
    public List<String> getWallPosts(String userId) {
        Map<String, String> mapPosts = fbSocialWeb.getWallPosts(UUID.fromString(userId));
        List<String> listPosts = new ArrayList<>();
        for (String key:
             mapPosts.keySet()) {
            listPosts.add(key + ":" + mapPosts.get(key));
        }

        return listPosts;
    }

    @Override
    public void addMoney(String userId, double sumOfMoney) {
        fbSocialWeb.addMoneyToScore(UUID.fromString(userId), sumOfMoney);
    }
}
