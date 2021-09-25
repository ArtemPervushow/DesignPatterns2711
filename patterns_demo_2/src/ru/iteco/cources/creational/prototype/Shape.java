package ru.iteco.cources.creational.prototype;

public abstract class Shape implements Cloneable {
    private String color;
    private int coordX;
    private int coordY;
    private Author author;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Shape newShape = (Shape) super.clone();
        newShape.setColor(this.color);
        newShape.setCoordX(this.coordX);
        newShape.setCoordY(this.coordY);
        newShape.setAuthor(this.author.clone());

        return newShape;
    }
}
