package ru.iteco.cources.eventsourcing;

public class ChangeNameData extends EventData {
    private final String newName;

    public ChangeNameData(String newName) {
        this.newName = newName;
    }

    public String getNewName() {
        return newName;
    }
}
