package ru.iteco.cources.poeaa.locks.implicit;

import java.util.ArrayList;

public class LockManager {
    private ArrayList<Long> lockList = new ArrayList<>();

    public boolean askLock(Long id) {
        if(lockList.contains(id)){
            return false;
        } else {
            lockList.add(id);
            return true;
        }
    }

    public void freeLock(Long id) {
        lockList.remove(id);
    }
}
