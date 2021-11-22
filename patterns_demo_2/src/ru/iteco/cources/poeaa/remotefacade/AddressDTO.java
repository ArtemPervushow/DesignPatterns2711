package ru.iteco.cources.poeaa.remotefacade;

public class AddressDTO {
    //no id

    //core fields
    protected String city;
    protected String street;
    protected String postCode;
    protected int number;

    //owner fields
    protected String ownerFio;
    protected boolean ownerSex;
    protected short ownerAge;

    //owner parents fields
    protected String[] parentsFios;
    protected boolean[] parentsSex;
    protected short[] parentsAges;

    //neighbours fields
    protected String[] neighFios;
    protected boolean[] neighSex;
    protected short[] neighAges;

    public AddressDTO() {
    }

    public AddressDTO(Address address) {
        this.city = address.getCity();
        this.street = address.getStreet();
        this.postCode = address.getPostCode();
        this.number = address.getNumber();
        this.ownerFio = address.getOwner().getFio();
        this.ownerSex = address.getOwner().isSex();
        this.ownerAge = address.getOwner().getAge();

        this.parentsFios = new String[address.getOwner().getParents().size()];
        this.parentsSex = new boolean[address.getOwner().getParents().size()];
        this.parentsAges = new short[address.getOwner().getParents().size()];;
        int parentCounter = 0;
        for (Human parent:
             address.getOwner().getParents()) {
            parentsFios[parentCounter] = parent.getFio();
            parentsAges[parentCounter] = parent.getAge();
            parentsSex[parentCounter] = parent.isSex();
            parentCounter++;
        }

        this.neighFios = new String[address.getNeighbours().size()];
        this.neighSex = new boolean[address.getNeighbours().size()];
        this.neighAges = new short[address.getNeighbours().size()];
        int neighsCounter = 0;
        for (Human neigh:
                address.getNeighbours()) {
            neighFios[neighsCounter] = neigh.getFio();
            neighSex[neighsCounter] = neigh.isSex();
            neighAges[neighsCounter] = neigh.getAge();
            neighsCounter++;
        }
    }

    public String toXml(){
        //here is code to serialize this to xml
        return "";
    }

    public AddressDTO fromXML(String xml){
        //here is code to deserialize xml to this
        return null;
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

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getOwnerFio() {
        return ownerFio;
    }

    public void setOwnerFio(String ownerFio) {
        this.ownerFio = ownerFio;
    }

    public boolean isOwnerSex() {
        return ownerSex;
    }

    public void setOwnerSex(boolean ownerSex) {
        this.ownerSex = ownerSex;
    }

    public short getOwnerAge() {
        return ownerAge;
    }

    public void setOwnerAge(short ownerAge) {
        this.ownerAge = ownerAge;
    }

    public String[] getParentsFios() {
        return parentsFios;
    }

    public void setParentsFios(String[] parentsFios) {
        this.parentsFios = parentsFios;
    }

    public boolean[] getParentsSex() {
        return parentsSex;
    }

    public void setParentsSex(boolean[] parentsSex) {
        this.parentsSex = parentsSex;
    }

    public short[] getParentsAges() {
        return parentsAges;
    }

    public void setParentsAges(short[] parentsAges) {
        this.parentsAges = parentsAges;
    }

    public String[] getNeighFios() {
        return neighFios;
    }

    public void setNeighFios(String[] neighFios) {
        this.neighFios = neighFios;
    }

    public boolean[] getNeighSex() {
        return neighSex;
    }

    public void setNeighSex(boolean[] neighSex) {
        this.neighSex = neighSex;
    }

    public short[] getNeighAges() {
        return neighAges;
    }

    public void setNeighAges(short[] neighAges) {
        this.neighAges = neighAges;
    }
}
