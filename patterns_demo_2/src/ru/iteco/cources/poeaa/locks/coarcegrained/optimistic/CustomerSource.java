package ru.iteco.cources.poeaa.locks.coarcegrained.optimistic;

import java.util.HashMap;
import java.util.Map;

public class CustomerSource {
    private Map<Long, Customer> customerMap = new HashMap<>();
    private long versionSequence = 0l;
    private AddressSource addressSource = new AddressSource();

    public void updateCustomer(Customer newCustomer) {
        Customer customerInSource= customerMap.get(newCustomer.getId());
        if(customerInSource != null &&
                newCustomer.getVersion() >= customerInSource.getVersion()) {
            versionSequence++;
            newCustomer.setVersion(versionSequence);

            customerMap.put(newCustomer.getId(), newCustomer);
            for (Address address : newCustomer.getAddresses()) {
                addressSource.updateAddress(address);
            }
        } else {
            System.out.println("Wrong version on object!!!");
        }
    }

    public Customer getCustomer(Long id) {
        return customerMap.get(id);
    }

    public long getVersionSequence() {
        return ++versionSequence;
    }

    public void printCustomers() {
        for (Long customerKey:
             customerMap.keySet()) {
            System.out.println(customerMap.get(customerKey));
        }
    }
}
