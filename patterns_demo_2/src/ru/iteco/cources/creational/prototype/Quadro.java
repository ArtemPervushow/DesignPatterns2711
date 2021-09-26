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
        Quadro quadro = (Quadro) super.clone();
        quadro.setNumberOfAngles(this.numberOfAngles);

        return quadro;
    }

    @Override
    public String toString() {
        return "Quadro{" +
                "numberOfAngles=" + numberOfAngles +
                '}';
    }
}
