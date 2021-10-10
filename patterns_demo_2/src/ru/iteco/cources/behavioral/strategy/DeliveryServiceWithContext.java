package ru.iteco.cources.behavioral.strategy;

public class DeliveryServiceWithContext {
    private DeliveryStrategy currentStrategy;

    private float clientBalance;
    private float destinationKm;

    public DeliveryServiceWithContext(float clientBalance, float destinationKm) {
        this.clientBalance = clientBalance;
        this.destinationKm = destinationKm;
    }

    public void setClientBalance(float clientBalance) {
        this.clientBalance = clientBalance;
    }

    public void setDestinationKm(float destinationKm) {
        this.destinationKm = destinationKm;
    }

    public void deliverUsingContext(String product, String owner) {
        checkStrategy();
        currentStrategy.deliver(product, owner);
    }

    private void checkStrategy() {
        if(clientBalance <= 0) {
            currentStrategy = new DeliverSelf();
        } else if(destinationKm > 10) {
            currentStrategy = new DeliveryByCar();
        } else {
            currentStrategy = new DeliveryByCourier();
        }
    }
}
