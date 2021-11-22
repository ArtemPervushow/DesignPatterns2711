package ru.iteco.cources.poeaa.locks.coarcegrained.optimistic;

import java.util.HashMap;
import java.util.Map;

public class AddressSource {
    private Map<Long, Address> addressMap = new HashMap<>();

    public void updateAddress(Address address) {
        addressMap.put(address.getId(), address);
    }
}
