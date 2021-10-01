package ru.iteco.cources.behavioral.observer;

public interface Publisher {
    void registerSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifyAllSubscribers();
}
