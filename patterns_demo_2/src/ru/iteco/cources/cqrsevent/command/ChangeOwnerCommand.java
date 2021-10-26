package ru.iteco.cources.cqrsevent.command;

import ru.iteco.cources.cqrsevent.AccountEvent;
import ru.iteco.cources.cqrsevent.AccountEventType;
import ru.iteco.cources.cqrsevent.ChangeOwnerData;

public class ChangeOwnerCommand extends AccountCommand {
    private final String newOwner;

    public ChangeOwnerCommand(int entityId, String newOwner) {
        super(entityId);
        this.newOwner = newOwner;
    }

    public String getNewOwner() {
        return newOwner;
    }

    @Override
    protected AccountEvent apply() {
        AccountEvent event = new AccountEvent(AccountEventType.CHANGE_OWNER,
                                              getEntityId(),
                                              new ChangeOwnerData(getNewOwner()));
        return event;
    }
}
