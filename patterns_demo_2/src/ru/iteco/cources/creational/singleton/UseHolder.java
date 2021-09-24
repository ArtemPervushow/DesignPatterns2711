package ru.iteco.cources.creational.singleton;

public class UseHolder extends ParentWithProperty {
    private static class HolderClass {
        public static final UseHolder INSTANCE = new UseHolder();
    }

    public static UseHolder getInstance() {
        return HolderClass.INSTANCE;
    }

    private UseHolder(){
    }
}
