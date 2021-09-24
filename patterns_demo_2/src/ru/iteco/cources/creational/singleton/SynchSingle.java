package ru.iteco.cources.creational.singleton;

public class SynchSingle extends ParentWithProperty{
    private static SynchSingle INSTANCE;

    public static synchronized SynchSingle getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new SynchSingle();
        }

        return INSTANCE;
    }

    private SynchSingle(){
    }
}
