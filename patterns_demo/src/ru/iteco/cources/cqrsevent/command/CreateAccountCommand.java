package ru.iteco.cources.cqrsevent.command;

import ru.iteco.cources.cqrsevent.AccountEvent;
import ru.iteco.cources.cqrsevent.AccountEventType;
import ru.iteco.cources.cqrsevent.CreateData;

public class CreateAccountCommand extends AccountCommand{
    private final String ownerName;

    public CreateAccountCommand(int entityId, String ownerName) {
        super(entityId);
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }


    @Override
    protected AccountEvent apply() {
        AccountEvent event = new AccountEvent(AccountEventType.CREATE,
                getEntityId(),
                new CreateData(getEntityId(), getOwnerName()));

        return event;
    }
}
