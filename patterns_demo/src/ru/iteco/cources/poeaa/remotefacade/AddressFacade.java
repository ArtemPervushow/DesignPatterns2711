package ru.iteco.cources.poeaa.remotefacade;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddressFacade {
    private List<Address> addressList = new ArrayList<>();

    public List<Address> getAddressListForStreet(String streetName){
        return addressList
                .stream()
                .filter(addr -> addr.getStreet()
                        .equals(streetName))
                .collect(Collectors.toList());
    }

    public Address getFullAddressByNumberAndStreet(short number,
                                                   String streetName) {
        return addressList
                .stream()
                .filter(address -> address.getStreet().equals(streetName)
                && address.getHouseNumber() == number)
                .collect(Collectors.toList()).get(0);
    }
}
