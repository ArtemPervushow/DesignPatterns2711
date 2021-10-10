package ru.iteco.cources.behavioral.strategy;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class DeliveryByCourier implements DeliveryStrategy {
    private List<String> courierList = new LinkedList<>();

    public DeliveryByCourier() {
        for (int i = 0; i < 5; i++) {
            courierList.add("Courier " + i);
        }
    }

    @Override
    public void deliver(String product, String owner) {
        Random random = new Random();
        System.out.println("Deliver " + product + " to "
                                      + owner + " using "
                                      + courierList.get(random.nextInt(5)));
    }
}
