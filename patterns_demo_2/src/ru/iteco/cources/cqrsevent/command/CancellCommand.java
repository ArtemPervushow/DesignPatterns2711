package ru.iteco.cources.cqrsevent.command;

import ru.iteco.cources.cqrsevent.AccountEvent;
import ru.iteco.cources.cqrsevent.AccountEventType;
import ru.iteco.cources.cqrsevent.CancellData;

public class CancellCommand extends AccountCommand {
    public CancellCommand(int entityId) {
        super(entityId);
    }

    @Override
    protected AccountEvent apply() {
        AccountEvent event = new AccountEvent(AccountEventType.CANCELL,
                getEntityId(),
                new CancellData(getEntityId()));
        return null;
    }
}
