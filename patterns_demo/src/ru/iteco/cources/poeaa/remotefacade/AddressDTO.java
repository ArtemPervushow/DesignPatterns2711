package ru.iteco.cources.poeaa.remotefacade;

public class AddressDTO {
    //no id

    //own fields
    private String city;
    private String street;
    private short houseNumber;

    //owner_fields
    private String ownerFio;
    private short ownerAge;
    private boolean ownerSex;
    private String ownerProfession;

    //humans fields
    private String[] humansFios;
    private short[] ownersAges;
    private boolean[] ownersSex;
    private String[] ownersProfessions;

    protected AddressDTO(String city, String street, short houseNumber, String ownerFio, short ownerAge, boolean ownerSex, String ownerProfession, String[] humansFios, short[] ownersAges, boolean[] ownersSex, String[] ownersProfessions) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.ownerFio = ownerFio;
        this.ownerAge = ownerAge;
        this.ownerSex = ownerSex;
        this.ownerProfession = ownerProfession;
        this.humansFios = humansFios;
        this.ownersAges = ownersAges;
        this.ownersSex = ownersSex;
        this.ownersProfessions = ownersProfessions;
    }

    public AddressDTO(Address address) {
        city = address.getCity();
        street = address.getStreet();
        houseNumber = address.getHouseNumber();

        ownerFio = address.getOwner().getFio();
        ownerAge = address.getOwner().getAge();
        ownerSex = address.getOwner().isSex();
        ownerProfession = address.getOwner().getProfession();

        humansFios = new String[address.getHumanList().size()];
        ownersAges = new short[address.getHumanList().size()];
        ownersSex = new boolean[address.getHumanList().size()];
        ownersProfessions = new String[address.getHumanList().size()];

        int humanCount = 0;
        for (Human human:
             address.getHumanList()) {
            humansFios[humanCount] = human.getFio();
            ownersAges[humanCount] = human.getAge();
            ownersSex[humanCount] = human.isSex();
            ownersProfessions[humanCount] = human.getProfession();

            humanCount++;
        }
    }

    public AddressDTO(String encoding, String content) {
        switch (encoding) {
            case "xml":
                //here is code to parse this from xml
                break;
            case "JSON":
                //here is code to parse this from json
                break;
        }
    }

    public String toXml(){
        //here is code to transform this.*fieldName to xml
        return "";
    }

    public String toJSON(){
        //here is code to transform this.*fieldName to json
        return "";
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public short getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(short houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getOwnerFio() {
        return ownerFio;
    }

    public void setOwnerFio(String ownerFio) {
        this.ownerFio = ownerFio;
    }

    public short getOwnerAge() {
        return ownerAge;
    }

    public void setOwnerAge(short ownerAge) {
        this.ownerAge = ownerAge;
    }

    public boolean isOwnerSex() {
        return ownerSex;
    }

    public void setOwnerSex(boolean ownerSex) {
        this.ownerSex = ownerSex;
    }

    public String getOwnerProfession() {
        return ownerProfession;
    }

    public void setOwnerProfession(String ownerProfession) {
        this.ownerProfession = ownerProfession;
    }

    public String[] getHumansFios() {
        return humansFios;
    }

    public void setHumansFios(String[] humansFios) {
        this.humansFios = humansFios;
    }

    public short[] getOwnersAges() {
        return ownersAges;
    }

    public void setOwnersAges(short[] ownersAges) {
        this.ownersAges = ownersAges;
    }

    public boolean[] getOwnersSex() {
        return ownersSex;
    }

    public void setOwnersSex(boolean[] ownersSex) {
        this.ownersSex = ownersSex;
    }

    public String[] getOwnersProfessions() {
        return ownersProfessions;
    }

    public void setOwnersProfessions(String[] ownersProfessions) {
        this.ownersProfessions = ownersProfessions;
    }
}
