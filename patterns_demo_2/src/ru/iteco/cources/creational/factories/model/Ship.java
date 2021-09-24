package ru.iteco.cources.creational.factories.model;

public class Ship extends Vehicle {
    private double draught;

    public double getDraught() {
        return draught;
    }

    public void setDraught(double draught) {
        this.draught = draught;
    }

    public Ship() {
        model = "Titanik";
    }

    @Override
    public void move() {
        System.out.println("Walk like a ship");
    }
}
