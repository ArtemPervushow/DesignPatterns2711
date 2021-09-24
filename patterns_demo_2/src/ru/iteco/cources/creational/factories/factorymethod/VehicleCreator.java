package ru.iteco.cources.creational.factories.factorymethod;

import ru.iteco.cources.creational.factories.model.Car;
import ru.iteco.cources.creational.factories.model.Plane;
import ru.iteco.cources.creational.factories.model.Ship;
import ru.iteco.cources.creational.factories.model.Vehicle;

public class VehicleCreator {
    public static Vehicle createVehicle(String type) {
        switch (type) {
            case "plane":
                return new Plane();
            case "car":
                return new Car();
            case "Ship":
                return new Ship();
        }

        return null;
    }
}
