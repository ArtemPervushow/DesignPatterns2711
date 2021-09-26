package ru.iteco.cources.creational.factories.model;

public class Plane extends Vehicle {
    private short atackAngle;

    public short getAtackAngle() {
        return atackAngle;
    }

    public void setAtackAngle(short atackAngle) {
        this.atackAngle = atackAngle;
    }

    public Plane() {
        model = "Sport Cruizer";
    }

    @Override
    public void move() {
        System.out.println("Fly like a plane");
    }
}
