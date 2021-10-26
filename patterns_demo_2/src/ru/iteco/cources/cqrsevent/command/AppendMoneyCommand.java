package ru.iteco.cources.cqrsevent.command;

import ru.iteco.cources.cqrsevent.AccountEvent;
import ru.iteco.cources.cqrsevent.AccountEventType;
import ru.iteco.cources.cqrsevent.DepositData;

public class AppendMoneyCommand extends AccountCommand {
    private final float money;

    public AppendMoneyCommand(int entityId, float money) {
        super(entityId);
        this.money = money;
    }

    public float getMoney() {
        return money;
    }

    @Override
    protected AccountEvent apply() {
        AccountEvent event = new AccountEvent(AccountEventType.DEPOSIT,
                getEntityId(),
                new DepositData(getMoney()));

        return event;
    }
}
