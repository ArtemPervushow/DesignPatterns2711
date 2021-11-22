package ru.iteco.cources.poeaa.locks.implicit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerSource {
    private Map<Long, Customer> customerMap = new HashMap<>();
    private LockManager lockManager = new LockManager();

    public CustomerSource() {
        customerMap.put(1l, new Customer(1, "Artem", 100.0f));
        customerMap.put(2l, new Customer(2, "Kate", 50.0f));
        customerMap.put(3l, new Customer(3, "Denis", 10.0f));
    }

    public void updateCustomer(Customer customer) {
        if(!lockManager.askLock(customer.getId())){
            try {
                Thread.sleep(100);
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            updateCustomer(customer);
        } else {
            customerMap.put(customer.getId(), customer);
            lockManager.freeLock(customer.getId());
        }
    }

    public void printCustomers() {
        for (Long key:
             customerMap.keySet()) {
            System.out.println(customerMap.get(key));
        }
    }
}