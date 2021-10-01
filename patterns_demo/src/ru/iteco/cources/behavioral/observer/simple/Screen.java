package ru.iteco.cources.behavioral.observer.simple;

public class Screen implements Observer {
    private String number;

    public Screen(String number) {
        this.number = number;
    }

    @Override
    public void update(String data) {
        System.out.println("There is a data " + data + " on the screen " + number);
    }
}
