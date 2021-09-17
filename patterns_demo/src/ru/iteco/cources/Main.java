package ru.iteco.cources;

import ru.iteco.cources.creational.singleton.EnSingle;

public class Main {

    public static void main(String[] args) {
        EnSingle.INSTANCE.compareTo(null);
    }
}
