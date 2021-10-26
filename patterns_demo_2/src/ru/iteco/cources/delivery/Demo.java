package ru.iteco.cources.delivery;

import java.util.UUID;

public class Demo {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Agent agent = new Agent(receiver);
        Sender sender = new Sender(agent);

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }

            sender.sendMessage(new Message(UUID.randomUUID(),
                          System.currentTimeMillis() + ""));
        }
    }
}
