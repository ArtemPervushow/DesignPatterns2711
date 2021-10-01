package ru.iteco.cources.behavioral.observer;

public class NewsSpectator implements Subscriber {
    private String name;

    public NewsSpectator(String name) {
        this.name = name;
    }

    @Override
    public void update(String data) {
        System.out.println(name + " is watching " + data);
    }
}
