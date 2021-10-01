package ru.iteco.cources.behavioral.observer.real;

import java.util.Observable;
import java.util.Observer;

public class WarehouseService implements Observer {
    void getOrderProducts(Order order) {
        System.out.println("Get products from order " + order);
    }

    @Override
    public void update(Observable o, Object arg) {
        getOrderProducts((Order) arg);
    }
}
