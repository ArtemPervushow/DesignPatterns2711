package ru.iteco.cources.structural.flyweight;

public class Product {
    private String name;
    private Size size;
    private Color color;
    private Brand brand;

    public Product(String name, Size size, Color color, Brand brand) {
        this.name = name;
        this.size = size;
        this.color = color;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
