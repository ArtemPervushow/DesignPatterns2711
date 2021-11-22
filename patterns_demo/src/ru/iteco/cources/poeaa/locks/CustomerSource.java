package ru.iteco.cources.poeaa.locks;

import java.util.HashMap;
import java.util.Map;

public class CustomerSource {
    private Map<Long, Customer> customerMap = new HashMap<>();

    public CustomerSource() {
        customerMap.put(1l, new Customer(1, "Artem", 100.0f));
        customerMap.put(2l, new Customer(2, "Kate", 50.0f));
        customerMap.put(3l, new Customer(3, "Denis", 10.0f));
    }

    public void updateCustomer(Customer customer) {
        customerMap.put(customer.getId(), customer);
    }

    public void printCustomers() {
        for (Long key:
             customerMap.keySet()) {
            System.out.println(customerMap.get(key));
        }
    }
}