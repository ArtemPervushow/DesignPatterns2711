package ru.iteco.cources.behavioral.observer.simple;

public interface Observable {
    void registerObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyAllObservers();
}
