package ru.iteco.cources.creational.singleton;

public class Old {
    private static Old INSTANCE;

    public static Old getINSTANCE() {
        if(INSTANCE == null) {
            INSTANCE = new Old();
        }
        return INSTANCE;
    }

    private Old(){

    }
}
