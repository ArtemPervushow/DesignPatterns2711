package ru.iteco.cources.behavioral.strategy;

public class DeliverSelf implements DeliveryStrategy {
    @Override
    public void deliver(String product, String owner) {
        System.out.println("Product " + product + " take by owner self " + owner);
    }
}
