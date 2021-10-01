package ru.iteco.cources.behavioral.observer.real;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class OrderService {
    private List<Observer> observerList = new ArrayList<>();

    void makeOrder(Order order) {
        notifyAllObs(order);
    }

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    private void notifyAllObs(Order order){
        for (Observer obs:
             observerList) {
            obs.update(null, order);
        }
    }
}
