package ru.iteco.cources.cqrsevent;

public class ChangeOwnerData extends EventData {
    private final String newOwner;

    public ChangeOwnerData(String newOwner) {
        this.newOwner = newOwner;
    }

    public String getNewOwner() {
        return newOwner;
    }
}
