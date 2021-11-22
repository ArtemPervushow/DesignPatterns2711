package ru.iteco.cources.poeaa.remotefacade;

public class AddressMapper {
    public AddressDTO toDto(Address address) {
        AddressDTO addressDTO = new AddressDTO();

        addressDTO.city = address.getCity();
        addressDTO.street = address.getStreet();
        addressDTO.postCode = address.getPostCode();
        addressDTO.number = address.getNumber();
        addressDTO.ownerFio = address.getOwner().getFio();
        addressDTO.ownerSex = address.getOwner().isSex();
        addressDTO.ownerAge = address.getOwner().getAge();

        addressDTO.parentsFios = new String[address.getOwner().getParents().size()];
        addressDTO.parentsSex = new boolean[address.getOwner().getParents().size()];
        addressDTO.parentsAges = new short[address.getOwner().getParents().size()];
        ;
        int parentCounter = 0;
        for (Human parent :
                address.getOwner().getParents()) {
            addressDTO.parentsFios[parentCounter] = parent.getFio();
            addressDTO.parentsAges[parentCounter] = parent.getAge();
            addressDTO.parentsSex[parentCounter] = parent.isSex();
            parentCounter++;
        }

        addressDTO.neighFios = new String[address.getNeighbours().size()];
        addressDTO.neighSex = new boolean[address.getNeighbours().size()];
        addressDTO.neighAges = new short[address.getNeighbours().size()];
        int neighsCounter = 0;
        for (Human neigh :
                address.getNeighbours()) {
            addressDTO.neighFios[neighsCounter] = neigh.getFio();
            addressDTO.neighSex[neighsCounter] = neigh.isSex();
            addressDTO.neighAges[neighsCounter] = neigh.getAge();
            neighsCounter++;
        }

        return addressDTO;
    }

    public Address toAddress(AddressDTO addressDTO) {
        return null;
    }

    public String toXml(AddressDTO address){
        //here is code to serialize this to xml
        return "";
    }

    public AddressDTO fromXML(String xml){
        //here is code to deserialize xml to this
        return null;
    }
}
