package ru.iteco.cources.creational.factorymethod;

public class MobilePhone extends Product {
    private String modelNum;

    private MobilePhone() {
        modelNum = "default";
    }

    @Override
    public String getInfo() {
        return "mobile phone model " + modelNum;
    }

    public static Product createProduct() {
        return new MobilePhone();
    }
}
