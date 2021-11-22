package ru.iteco.cources.poeaa.locks.coarcegrained;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerSource {
    private Map<Long, Customer> customerMap = new HashMap<>();
    private AddressSource addressSource = new AddressSource();
    private List<Long> lockList = new ArrayList<>();

    public CustomerSource() {
        customerMap.put(1l, new Customer(1, "Artem", 100.0f));
        customerMap.put(2l, new Customer(2, "Kate", 50.0f));
        customerMap.put(3l, new Customer(3, "Denis", 10.0f));
    }

    public void updateCustomer(Customer customer) {
        if(lockList.contains(customer.getId())){
            try {
                Thread.sleep(100);
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }

            updateCustomer(customer);

            for (Address address : customer.getAddresses()) {
                addressSource.updateAddress(address);
            }
        } else {
            lockList.add(customer.getId());
            customerMap.put(customer.getId(), customer);
            lockList.remove(customer.getId());
        }
    }

    public void printCustomers() {
        for (Long key:
             customerMap.keySet()) {
            System.out.println(customerMap.get(key));
        }
    }
}