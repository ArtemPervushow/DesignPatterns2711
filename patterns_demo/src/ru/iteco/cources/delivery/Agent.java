package ru.iteco.cources.delivery;

import java.util.Random;

public class Agent {
    private Receiver receiver;
    private Random random = new Random();

    public Agent(Receiver receiver) {
        this.receiver = receiver;
    }

    public void atLeastOnce(Message message) {
        while (random.nextInt(3) != 1) {
            receiver.receive(message);
        }
    }

    public void atMostOnce(Message message) {
        for (int i = 0; i < 5; i++) {
            if(random.nextInt(3) == 1) {
                receiver.receive(message);
                break;
            }
        }
    }

    public void exactlyOnce(Message message) {
        System.out.println("Sending message on agent exactlyOnce");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        receiver.receive(message);
    }
}
