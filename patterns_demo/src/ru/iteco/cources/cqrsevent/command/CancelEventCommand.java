package ru.iteco.cources.cqrsevent.command;

import ru.iteco.cources.cqrsevent.AccountEvent;
import ru.iteco.cources.cqrsevent.AccountEventType;
import ru.iteco.cources.cqrsevent.CancelData;
import ru.iteco.cources.cqrsevent.CloseData;

public class CancelEventCommand extends AccountCommand {

    private final int targetEventId;

    public CancelEventCommand(int entityId, int targetEventId) {
        super(entityId);
        this.targetEventId = targetEventId;
    }

    @Override
    protected AccountEvent apply() {
        return new AccountEvent(AccountEventType.CANCEL,
                getEntityId(),
                new CancelData(targetEventId));
    }
}
