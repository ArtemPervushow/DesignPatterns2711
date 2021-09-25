package ru.iteco.cources.creational.factories.abstractfactory;

import ru.iteco.cources.creational.factories.model.Car;
import ru.iteco.cources.creational.factories.model.Vehicle;

public class CarFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        Car car = new Car();
        car.setPower(100);

        return car;
    }
}
