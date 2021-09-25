package ru.iteco.cources;

import ru.iteco.cources.creational.singleton.DoubleCheck;

public class Main {

    public static void main(String[] args) {
        DoubleCheck doubleCheck1 = DoubleCheck.getInstance();
        doubleCheck1.some = "Artem";
        DoubleCheck doubleCheck2 = DoubleCheck.getInstance();
        System.out.println(doubleCheck2.some);
    }
}
