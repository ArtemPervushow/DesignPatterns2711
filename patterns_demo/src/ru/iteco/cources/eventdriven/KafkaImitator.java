package ru.iteco.cources.eventdriven;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KafkaImitator {
    private List<SpotSearchEvent> eventList = new ArrayList<>();
    private Map<String, Integer> consumerReadMap = new HashMap<>();

    public void populateEvent(SpotSearchEvent event) {
        eventList.add(event);
    }

    public SpotSearchEvent readForConsumer(String consumerId){
        int readPosition;
        if(consumerReadMap.containsKey(consumerId)){
            int lastReadPosition = consumerReadMap.get(consumerId);
            consumerReadMap.put(consumerId, ++lastReadPosition);
            readPosition = lastReadPosition;
        } else {
            consumerReadMap.put(consumerId, 0);
            readPosition = 0;
        }

        return eventList.get(readPosition);
    }
}
