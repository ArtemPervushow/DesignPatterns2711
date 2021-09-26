package ru.iteco.cources.creational.factories.model;

public class Car extends Vehicle {
    private int power;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Car() {
        model = "A8";
    }

    @Override
    public void move() {
        System.out.println("Move like a car");
    }
}
