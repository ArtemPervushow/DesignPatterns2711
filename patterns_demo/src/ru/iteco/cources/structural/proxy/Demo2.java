package ru.iteco.cources.structural.proxy;

import ru.iteco.cources.structural.proxy.cashed.BigFileSearcher;
import ru.iteco.cources.structural.proxy.cashed.SearchPhrase;

public class Demo2 {
    public static void main(String[] args) throws InterruptedException {
        SearchPhrase searchPhrase = new BigFileSearcher();

        System.out.println(searchPhrase.find("876878"));
        Thread.sleep(1000);
        System.out.println(searchPhrase.find("9327863"));
        Thread.sleep(1000);
        System.out.println(searchPhrase.find("876878"));
    }
}
