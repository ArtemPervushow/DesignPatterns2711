package ru.iteco.cources.creational.prototype;

public abstract class Shape implements Cloneable {
    protected int coordX;
    protected int coordY;
    protected String color;
    protected Author author;

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Shape newShape = (Shape) super.clone();
        newShape.color = this.color;
        newShape.coordY = this.coordY;
        newShape.coordX = this.coordX;

        return newShape;
    }
}
