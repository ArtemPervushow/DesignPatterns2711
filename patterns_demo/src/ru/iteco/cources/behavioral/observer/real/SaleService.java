package ru.iteco.cources.behavioral.observer.real;

import java.util.Observable;
import java.util.Observer;

public class SaleService implements Observer {
    void makeDiscount(Order order) {
        System.out.println("Discount for order " + order);
    }

    @Override
    public void update(Observable o, Object arg) {
        makeDiscount((Order) arg);
    }
}
