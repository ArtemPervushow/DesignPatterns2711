package ru.iteco.cources.creational.prototype;

public class Quadro extends Shape {
    private short numberOfAngles;

    public short getNumberOfAngles() {
        return numberOfAngles;
    }

    public void setNumberOfAngles(short numberOfAngles) {
        this.numberOfAngles = numberOfAngles;
    }

    @Override
    protected Quadro clone() throws CloneNotSupportedException {
        Quadro newShape = new Quadro();
        newShape.numberOfAngles = this.numberOfAngles;
        newShape.color = this.color;
        newShape.coordX = this.coordX;
        newShape.coordY = this.coordY;
        newShape.author = this.author.clone();

        return newShape;
    }
}
