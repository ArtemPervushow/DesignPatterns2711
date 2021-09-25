package ru.iteco.cources.structural;

import ru.iteco.cources.structural.adapter.SocialWeb;
import ru.iteco.cources.structural.adapter.VkAdapter;
import ru.iteco.cources.structural.adapter.VkSocialWeb;

public class Demo {
    public static void main(String[] args) {
        SocialWeb socialWeb = new VkAdapter(new VkSocialWeb());

        socialWeb.postToWall("lsdjlkjdal", "Hi");
    }
}
