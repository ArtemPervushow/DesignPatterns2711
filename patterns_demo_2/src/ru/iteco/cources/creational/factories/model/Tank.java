package ru.iteco.cources.creational.factories.model;

public class Tank extends Vehicle {
    private String model;
    private short weight;
    private int capacityMove;
    private float calibr;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public short getWeight() {
        return weight;
    }

    public void setWeight(short weight) {
        this.weight = weight;
    }

    public int getCapacityMove() {
        return capacityMove;
    }

    public void setCapacityMove(int capacityMove) {
        this.capacityMove = capacityMove;
    }

    public float getCalibr() {
        return calibr;
    }

    public void setCalibr(float calibr) {
        this.calibr = calibr;
    }

    @Override
    public void move() {
        System.out.println("Move like a tank!");
    }
}
