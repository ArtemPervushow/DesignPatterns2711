package ru.iteco.cources.eventdriven;

import java.util.UUID;

public class SpotSearchEvent {
    private int userID;
    private UUID id;
    private short newAge;

    public SpotSearchEvent(int userID, UUID id, short newAge) {
        this.userID = userID;
        this.id = id;
        this.newAge = newAge;
    }

    @Override
    public String toString() {
        return "SpotSearchEvent{" +
                "userID=" + userID +
                ", id=" + id +
                ", newAge=" + newAge +
                '}';
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public short getNewAge() {
        return newAge;
    }

    public void setNewAge(short newAge) {
        this.newAge = newAge;
    }
}
