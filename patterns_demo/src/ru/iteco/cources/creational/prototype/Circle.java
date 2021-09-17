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
        /*Circle newShape = new Circle();
        newShape.coordX = this.coordX;
        newShape.coordY = this.coordY;
        newShape.color = this.color;*/
        Object old = super.clone();
        Circle newShape = (Circle) super.clone();
        newShape.radius = this.radius;
        newShape.author = this.author.clone();

        return newShape;
    }
}
