package ru.iteco.cources.structural.facade;

public class DeliveryService {
    public void makeDeliver(String customerName, String productName, int count) {
        System.out.println("Deliver to customer " + customerName +
                            " product " + productName +
                            " in count of" + count);
    }
}
