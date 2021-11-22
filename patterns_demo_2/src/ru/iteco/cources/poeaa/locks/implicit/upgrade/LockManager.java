package ru.iteco.cources.poeaa.locks.implicit.upgrade;

import java.util.ArrayList;

public class LockManager {
    private ArrayList<Long> lockList = new ArrayList<>();

    public boolean tryLockCustomer(Customer customer) {
        if(lockList.contains(customer)) {
            return false;
        } else {
            lockList.add(customer.getId());
            return true;
        }
    }

    public void freeCustomer(Long id) {
        lockList.remove(id);
    }
}
