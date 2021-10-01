package ru.iteco.cources.behavioral.observer.simple;

import java.util.ArrayList;
import java.util.List;

public class Sensor implements Observable {
    private List<Observer> observerList = new ArrayList<>();
    private String data;

    public List<Observer> getObserverList() {
        return observerList;
    }

    public void setObserverList(List<Observer> observerList) {
        this.observerList = observerList;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer obs:
             observerList) {
            obs.update(data);
        }
    }
}
