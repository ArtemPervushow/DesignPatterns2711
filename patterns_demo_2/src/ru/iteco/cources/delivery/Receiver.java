package ru.iteco.cources.delivery;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Receiver {
    private List<Message> messages = new ArrayList<>();

    public void receive(Message message) {
        if(!messages.contains(message)) {
            System.out.println(message.toString());
            messages.add(message);
        }
    }
}