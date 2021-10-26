package ru.iteco.cources.queue.spot;

import ru.iteco.cources.queue.SpotSearchEvent;
import ru.iteco.cources.queue.SpotSearchQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Spot {
    public  List<SpotUser> spotUserList = new ArrayList<>();
    private SpotSearchQueue queue;

    public Spot(SpotSearchQueue queue) {
        this.queue = queue;
    }

    public void addUser(SpotUser spotUser) {
        spotUserList.add(spotUser);
    }

    public void updateUser(SpotUser user) {
        if(spotUserList.contains(user)) {
            for (SpotUser spotUsr:
                 spotUserList) {
                if(spotUsr.getId() == user.getId()) {
                    spotUserList.remove(spotUsr);
                }
            }

            queue.add(new SpotSearchEvent(user.getId(),
                                          user.getAge(),
                                            System.currentTimeMillis(),
                                            UUID.randomUUID()));

            spotUserList.add(user);
        }
    }
}
