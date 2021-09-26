package ru.iteco.cources.creational.factories;

import ru.iteco.cources.creational.factories.abstractfactory.CarFactory;
import ru.iteco.cources.creational.factories.abstractfactory.VehicleFactory;
import ru.iteco.cources.creational.factories.builder.TankBuilder;
import ru.iteco.cources.creational.factories.factorymethod.VehicleCreator;
import ru.iteco.cources.creational.factories.model.Vehicle;

public class Demo {
    private static VehicleFactory factory = new CarFactory();

    public static void main(String[] args) {
        Vehicle vehicle = VehicleCreator.createVehicle(args[0]);
        vehicle.move();

        Vehicle vehicleFromFactory = factory.createVehicle();
        vehicleFromFactory.move();

        try {
            Vehicle tank = new TankBuilder()
                                .setCalibr(10l)
                                .setCapacityMove(1000)
                                .setModel("T34")
                                .setWeight((short) 4000)
                                .build();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
