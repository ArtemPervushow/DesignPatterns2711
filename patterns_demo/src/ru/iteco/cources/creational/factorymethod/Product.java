package ru.iteco.cources.creational.factorymethod;

public abstract class Product {
    public abstract String getInfo();

   /* public static Product createProduct(String type){
        switch (type) {
            case "Bag":
                return Bag.createProduct();
            default:
                return MobilePhone.createProduct();
        }
    }*/
}
