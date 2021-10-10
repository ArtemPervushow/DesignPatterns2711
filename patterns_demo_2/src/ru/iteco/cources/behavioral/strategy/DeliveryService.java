package ru.iteco.cources.behavioral.strategy;

public class DeliveryService {
    private DeliveryStrategy currentStrategy = new DeliveryByCourier();

    public void delivery(String product, String owner) {
        currentStrategy.deliver(product, owner);
    }

    public void setCurrentStrategy(DeliveryStrategy currentStrategy) {
        this.currentStrategy = currentStrategy;
    }
}
