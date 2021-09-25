package ru.iteco.cources.creational.singleton;

public class UsingInner {
    private static class HolderClass {
        public static final UsingInner INSTANCE = new UsingInner();
    }

    public static UsingInner getInstance() {
        return HolderClass.INSTANCE;
    }

    private UsingInner(){
    }
}
