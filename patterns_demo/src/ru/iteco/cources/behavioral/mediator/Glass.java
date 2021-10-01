package ru.iteco.cources.behavioral.mediator;

public class Glass {
    private String name;
    private float widht;
    private float height;
    private double size;

    @Override
    public String toString() {
        return "Glass{" +
                "name='" + name + '\'' +
                ", widht=" + widht +
                ", height=" + height +
                ", size=" + size +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWidht() {
        return widht;
    }

    public void setWidht(float widht) {
        this.widht = widht;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
