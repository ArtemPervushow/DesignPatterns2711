package ru.iteco.cources.poeaa.remotefacade;

import ru.iteco.cources.poeaa.remotefacade.repo.AddressRepo;
import ru.iteco.cources.poeaa.remotefacade.repo.HumanRepo;

import java.util.List;
import java.util.stream.Collectors;

public class AddressFacade {
    //Could be remote
    private AddressRepo addressRepo = new AddressRepo();
    //Could be remote
    private HumanRepo humanRepo = new HumanRepo();

    public List<Address> getAddressByFio(String fio) {
        Human human = humanRepo.getByFio(fio);

        return addressRepo
                .getAll()
                .stream()
                .filter(address -> address.getOwner().equals(human))
                .collect(Collectors.toList());
    }
}
