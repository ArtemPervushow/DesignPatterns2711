package ru.iteco.cources.behavioral.observer.real;

import java.util.Observable;
import java.util.Observer;

public class DeliveryService implements Observer {
    void deliverProducts(Order order) {
        System.out.println("Deliver products from order " + order);
    }

    @Override
    public void update(Observable o, Object arg) {
        deliverProducts((Order) arg);
    }
}
