package ru.iteco.cources.structural.facade;

public class PaymentService {
    public boolean payForProduct(String name, double sum) {
        if(sum > 0) {
            System.out.println("We payed " + sum + " for product named" + name);
            return true;
        } else {
            return false;
        }
    }
}
