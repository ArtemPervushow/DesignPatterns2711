package ru.iteco.cources.structural.proxy.cashed;

public interface Search {
    boolean find(String phrase) throws InterruptedException;
}
