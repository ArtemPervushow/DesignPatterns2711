package ru.iteco.cources.poeaa.locks;

import java.util.HashMap;
import java.util.Map;

public class CustomerSource {
    private Map<Long, Customer> customerMap = new HashMap<>();

    public void updateCustomer(Customer customer) {
        customerMap.put(customer.getId(), customer);
    }

    public void printCustomers() {
        for (Long customerKey:
             customerMap.keySet()) {
            System.out.println(customerMap.get(customerKey));
        }
    }
}
