package ru.iteco.cources.creational.singleton;

public class Lazy extends ParentWithProperty {
    private static Lazy INSTANCE;

    public static Lazy getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Lazy();
        }

        return INSTANCE;
    }

    private Lazy(){
    }
}
