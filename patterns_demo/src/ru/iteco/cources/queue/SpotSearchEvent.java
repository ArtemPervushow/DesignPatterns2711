package ru.iteco.cources.queue;

import java.util.UUID;

public class SpotSearchEvent {
    private long userID;
    private short newAge;
    private long timeOfUpdate;
    private UUID uuid;

    public SpotSearchEvent(long userID, short newAge, long timeOfUpdate, UUID uuid) {
        this.userID = userID;
        this.newAge = newAge;
        this.timeOfUpdate = timeOfUpdate;
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "SpotSearchEvent{" +
                "userID=" + userID +
                ", newAge=" + newAge +
                ", timeOfUpdate=" + timeOfUpdate +
                '}';
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public short getNewAge() {
        return newAge;
    }

    public void setNewAge(short newAge) {
        this.newAge = newAge;
    }

    public long getTimeOfUpdate() {
        return timeOfUpdate;
    }

    public void setTimeOfUpdate(long timeOfUpdate) {
        this.timeOfUpdate = timeOfUpdate;
    }
}
