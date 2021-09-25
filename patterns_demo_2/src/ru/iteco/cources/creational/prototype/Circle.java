package ru.iteco.cources.creational.prototype;

public class Circle extends Shape {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    protected Circle clone() throws CloneNotSupportedException {
        Circle newCircle = (Circle) super.clone();
        newCircle.setRadius(this.radius);

        return newCircle;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
