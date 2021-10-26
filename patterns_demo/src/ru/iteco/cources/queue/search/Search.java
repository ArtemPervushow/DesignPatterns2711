package ru.iteco.cources.queue.search;

import ru.iteco.cources.queue.SpotSearchEvent;
import ru.iteco.cources.queue.SpotSearchQueue;

import java.util.ArrayList;
import java.util.List;

public class Search {
    public List<SearchUser> searchUsersList = new ArrayList<>();
    public SpotSearchQueue queue;
    private String id;

    public Search(SpotSearchQueue queue, String id) {
        this.queue = queue;
        this.id = id;

        Thread thread = new Thread(() -> {
            try {
                while (true) {
                    Thread.sleep(1000);

                    SpotSearchEvent event = queue.readWithConsumer(id);
                    if(event != null) {
                        for (SearchUser user:
                             searchUsersList) {
                            if(user.getUserId() == event.getUserID()) {
                                user.setAge(event.getNewAge());
                            }
                        }
                    }
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();
    }
}
