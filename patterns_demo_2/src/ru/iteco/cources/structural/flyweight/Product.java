package ru.iteco.cources.structural.flyweight;

public class Product {
    private final String name;
    private final Size size;
    private final Color color;

    public Product(String name, Size size, Color color) {
        this.name = name;
        this.size = size;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }
}
