package ru.iteco.cources.structural.proxy.cashed;

import ru.iteco.cources.structural.proxy.logged.Reporter;

public class Demo {
    private static Reporter reporter;

    public static void main(String[] args) throws InterruptedException {
        Search search1 = new SearchImpl("Abracadabra");
        Search search2 = new SearchWithCache(search1);

        System.out.println("1.1");
        System.out.println(search1.find("Abra"));
        System.out.println("1.2");
        System.out.println(search1.find("Abra"));

        System.out.println("2.1");
        System.out.println(search2.find("Abra"));
        System.out.println("2.2");
        System.out.println(search2.find("Abra"));
    }
}
