package ru.iteco.cources.queue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class SpotSearchQueue {
    public ArrayList<SpotSearchEvent> eventList = new ArrayList<>();
    private Map<String, Long> consumerPositions = new HashMap<>();

    public void add(SpotSearchEvent event) {
        eventList.add(event);
    }

    public SpotSearchEvent readWithConsumer(String consumerId) {
        if(!consumerPositions.containsKey(consumerId)) {
            consumerPositions.put(consumerId, 0l);
            return eventList.get(0);
        } else {
            long currentPosition = consumerPositions.get(consumerId);
            if(currentPosition < eventList.size() -1 ){
                currentPosition++;
                consumerPositions.put(consumerId, currentPosition);

                return eventList.get((int) currentPosition);
            } else {
                return null;
            }
        }
    }

}
