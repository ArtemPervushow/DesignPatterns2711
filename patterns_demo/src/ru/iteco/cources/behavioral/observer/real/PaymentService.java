package ru.iteco.cources.behavioral.observer.real;

import java.util.Observable;
import java.util.Observer;

public class PaymentService implements Observer {
    void payOrder(Order order) {
        System.out.println("Pay for order " + order);
    }

    @Override
    public void update(Observable o, Object arg) {
        payOrder((Order) arg);
    }
}
