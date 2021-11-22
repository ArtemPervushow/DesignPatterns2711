package ru.iteco.cources.poeaa.locks.pesimistic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CustomerSource {
    private Map<Long, Customer> customerMap = new HashMap<>();
    private ArrayList<Long> lockList = new ArrayList<>();

    public void updateCustomer(Customer customer) {
        customerMap.put(customer.getId(), customer);
    }

    public Customer getCustomer(long id) throws Exception {
        if(lockList.contains(id)) {
            throw new Exception("Customer transaction exception");
        }

        lockList.add(id);
        return customerMap.get(id);
    }

    public void freeCustomer(long id) {
        lockList.remove(id);
    }

    public void printCustomers() {
        for (Long customerKey:
             customerMap.keySet()) {
            System.out.println(customerMap.get(customerKey));
        }
    }
}
