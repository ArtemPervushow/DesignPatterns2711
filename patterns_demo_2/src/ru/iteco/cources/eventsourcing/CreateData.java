package ru.iteco.cources.eventsourcing;

public class CreateData extends EventData {
    private final int accountId;
    private final String owner;

    public CreateData(int accountId, String owner) {
        this.accountId = accountId;
        this.owner = owner;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getOwner() {
        return owner;
    }
}
