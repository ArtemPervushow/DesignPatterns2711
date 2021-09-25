package ru.iteco.cources.creational.factories.abstractfactory;

import ru.iteco.cources.creational.factories.model.Plane;
import ru.iteco.cources.creational.factories.model.Vehicle;

public class PlaneFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        Plane plane = new Plane();
        plane.setAtackAngle((short) 15);

        return plane;
    }
}
