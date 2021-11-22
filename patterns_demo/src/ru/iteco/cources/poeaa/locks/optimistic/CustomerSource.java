package ru.iteco.cources.poeaa.locks.optimistic;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class CustomerSource {
    private Map<Long, Customer> customerMap = new HashMap<>();
    private Long currentVersion = 0l;
    private Random random = new Random();

    public CustomerSource() {
        customerMap.put(1l, new Customer(1, "Artem", 100.0f));
        customerMap.put(2l, new Customer(2, "Kate", 50.0f));
        customerMap.put(3l, new Customer(3, "Denis", 10.0f));
    }

    public void updateCustomer(Customer customer) {
        Customer updatingCustomer = customerMap.get(customer.getId());
        if(customer.getVersion() >= updatingCustomer.getVersion()) {
            currentVersion += random.nextInt(1000);
            customer.setVersion(currentVersion);
            customerMap.put(customer.getId(), customer);
        } else {
            System.out.println("error! version is older");
        }
    }

    public Customer getByid(Long id) {
        return customerMap.get(id);
    }

    public void printCustomers() {
        for (Long key:
             customerMap.keySet()) {
            System.out.println(customerMap.get(key));
        }
    }
}