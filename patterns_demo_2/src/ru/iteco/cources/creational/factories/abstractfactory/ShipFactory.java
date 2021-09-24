package ru.iteco.cources.creational.factories.abstractfactory;

import ru.iteco.cources.creational.factories.model.Ship;
import ru.iteco.cources.creational.factories.model.Vehicle;

public class ShipFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        Ship ship = new Ship();
        ship.setDraught(100.5);

        return ship;
    }
}
