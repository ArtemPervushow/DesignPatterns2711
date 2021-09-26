package ru.iteco.cources.creational.singleton;

public class Simple extends ParentWithProperty {
    public static final Simple INSTANCE = new Simple();

    /*public static Simple getInstance() {
        return INSTANCE;
    }*/

    private Simple() {
    }
}
