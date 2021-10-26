package ru.iteco.cources.eventdriven;

import java.util.HashSet;
import java.util.Set;

public class Search {
    private Set<SearchUser> searchUserSet = new HashSet<>();
    private KafkaImitator kafkaImitator;

    public Search(KafkaImitator kafkaImitator) {
        this.kafkaImitator = kafkaImitator;
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }

            SpotSearchEvent event = kafkaImitator
                                        .readForConsumer(this.toString());
            for (SearchUser user:
                 searchUserSet) {
                if(event.getUserID() == user.getId()) {
                    user.setAge(event.getNewAge());
                    searchUserSet.add(user);
                }
            }
        });
        thread.start();
    }

    public Set<SearchUser> getSearchUserSet() {
        return searchUserSet;
    }
}
