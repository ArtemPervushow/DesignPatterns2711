package ru.iteco.cources.poeaa.locks.coarcegrained;

import java.util.HashMap;
import java.util.Map;

public class CustomerSource {
    private Map<Long, Customer> customerMap = new HashMap<>();
    private LockManager lockManager = new LockManager();
    private AddressSource addressSource = new AddressSource();

    public void updateCustomer(Customer customer) throws Exception {
        if (!lockManager.tryLockCustomer(customer)){
            throw new Exception("Customer already in use");
        }

        customerMap.put(customer.getId(), customer);

        //no need additional lock!
        for (Address address:
             customer.getAddresses()) {
            addressSource.updateAddress(address);
        }

        Thread.sleep(1000);

        lockManager.freeCustomer(customer.getId());
    }

    public Customer getCustomer(long id) {
        return customerMap.get(id);
    }

    public void printCustomers() {
        for (Long customerKey:
             customerMap.keySet()) {
            System.out.println(customerMap.get(customerKey));
        }
    }
}
