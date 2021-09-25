package ru.iteco.cources.structural.flyweight;

public class Color {
    private String name;
    private int rgbPattern;

    public Color(String name, int rgbPattern) {
        this.name = name;
        this.rgbPattern = rgbPattern;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRgbPattern() {
        return rgbPattern;
    }

    public void setRgbPattern(int rgbPattern) {
        this.rgbPattern = rgbPattern;
    }
}
