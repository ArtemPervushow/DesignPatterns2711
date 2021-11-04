package ru.iteco.cources.eventsourcing;

import java.time.Instant;
import java.util.Date;

public class Account {
    private int id;
    private String owner;
    private Date dateCreation;
    private Date dateClosed;
    private float balance;
    private boolean isActive = true;
    private Date lastUpdateDate;

    public Account(int id, String owner, Date dateCreation) {
        this.id = id;
        this.owner = owner;
        this.dateCreation = dateCreation;
        lastUpdateDate = Date.from(Instant.now());
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public int getId() {
        return id;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateClosed() {
        return dateClosed;
    }

    public void setDateClosed(Date dateClosed) {
        this.dateClosed = dateClosed;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void changeNameThatDoesNotEvenExist(String newName) {}
}
