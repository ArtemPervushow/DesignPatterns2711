package ru.iteco.cources.creational.singleton;

public class DoubleCheck extends ParentWithProperty {
    private static volatile DoubleCheck INSTANCE;

    public static DoubleCheck getInstance() {
        DoubleCheck localInstance = INSTANCE;
        if(localInstance == null) {
            synchronized (DoubleCheck.class) {
                localInstance = INSTANCE;
                if(localInstance == null) {
                    INSTANCE = new DoubleCheck();
                }
            }
        }

        return INSTANCE;
    }

    private DoubleCheck() {
    }
}
