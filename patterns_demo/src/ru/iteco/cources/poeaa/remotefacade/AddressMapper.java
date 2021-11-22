package ru.iteco.cources.poeaa.remotefacade;

public class AddressMapper {
    public Address fromDTO(AddressDTO addressDTO){
        Human owner = new Human(addressDTO.getOwnerFio(),
                addressDTO.getOwnerAge(),
                    addressDTO.isOwnerSex(),
                addressDTO.getOwnerProfession(),
                null);

        Address address = new Address(addressDTO.getCity(),
                addressDTO.getStreet(),
                addressDTO.getHouseNumber(),
                owner,
                null);

        return address;
    }

    public AddressDTO toDTO(Address address) {
        String city = address.getCity();
        String street = address.getStreet();
        Short houseNumber = address.getHouseNumber();

        String ownerFio = address.getOwner().getFio();
        Short ownerAge = address.getOwner().getAge();
        Boolean ownerSex = address.getOwner().isSex();
        String ownerProfession = address.getOwner().getProfession();

        String[] humansFios = new String[address.getHumanList().size()];
        short[] ownersAges = new short[address.getHumanList().size()];
        boolean[] ownersSex = new boolean[address.getHumanList().size()];
        String[] ownersProfessions = new String[address.getHumanList().size()];

        int humanCount = 0;
        for (Human human:
                address.getHumanList()) {
            humansFios[humanCount] = human.getFio();
            ownersAges[humanCount] = human.getAge();
            ownersSex[humanCount] = human.isSex();
            ownersProfessions[humanCount] = human.getProfession();

            humanCount++;
        }

        return new AddressDTO(city,
                street,
                houseNumber,
                ownerFio,
                ownerAge,
                ownerSex,
                ownerProfession,
                humansFios,
                ownersAges,
                ownersSex,
                ownersProfessions);
    }
}
