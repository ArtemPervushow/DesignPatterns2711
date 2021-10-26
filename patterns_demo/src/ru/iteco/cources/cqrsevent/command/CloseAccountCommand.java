package ru.iteco.cources.cqrsevent.command;

import ru.iteco.cources.cqrsevent.AccountEvent;
import ru.iteco.cources.cqrsevent.AccountEventType;
import ru.iteco.cources.cqrsevent.CloseData;

public class CloseAccountCommand extends AccountCommand {

    public CloseAccountCommand(int entityId) {
        super(entityId);
    }

    @Override
    protected AccountEvent apply() {
        AccountEvent event = new AccountEvent(AccountEventType.CLOSE,
                getEntityId(),
                new CloseData("I want"));

        return event;
    }
}
