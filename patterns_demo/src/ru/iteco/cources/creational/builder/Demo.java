package ru.iteco.cources.creational.builder;

public class Demo {
    public static void main(String[] args) {
        HumanBuilder godHumanBuilder = new GodHumanBuilder();
        try {
            Human artem = godHumanBuilder
                                .setAge((short) 19)
                                .setName("Artem")
                                .setWeight((short) 100)
                                .setHeight((short) 189)
                                .setSex(true)
                                .build();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
