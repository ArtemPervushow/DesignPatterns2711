package ru.iteco.cources.poeaa.locks.implicit.timeout;

import java.util.*;

public class LockManager {
    private Set<Long> lockList = new HashSet<>();
    private Map<Long, Integer> tryLockTimeoutMap = new HashMap<>();

    public boolean tryLockCustomer(Customer customer) {
        if(lockList.contains(customer) &&
                tryLockTimeoutMap.get(customer.getId()) < 10) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }

            int repeats = tryLockTimeoutMap.get(customer.getId());
            repeats++;
            tryLockTimeoutMap.put(customer.getId(),
                                  repeats);

            return tryLockCustomer(customer);
        } else {
            lockList.add(customer.getId());
            return true;
        }
    }

    public void freeCustomer(Long id) {
        lockList.remove(id);
    }
}
