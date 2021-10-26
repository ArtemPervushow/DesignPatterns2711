package ru.iteco.cources.cqrsevent.command;

import ru.iteco.cources.cqrsevent.AccountEvent;

import java.time.Instant;
import java.util.Date;
import java.util.Random;

public abstract class AccountCommand {
    private final int id;
    private final int entityId;
    //private final AccountCommandType type;
    private Date commandDate;
    private static Random random = new Random();

    public AccountCommand(int entityId) {
        this.id = random.nextInt();
        this.entityId = entityId;
        //this.type = type;
        commandDate = Date.from(Instant.now());
    }

    public int getId() {
        return id;
    }

    protected abstract AccountEvent apply();

    public int getEntityId() {
        return entityId;
    }

    /*public AccountCommandType getType() {
        return type;
    }*/

    public Date getCommandDate() {
        return commandDate;
    }
}
