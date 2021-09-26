package ru.iteco.cources.structural.flyweight;

public class Size {
    private final int value;
    private final String name;

    public Size(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
