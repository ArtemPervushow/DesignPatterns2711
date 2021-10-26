package ru.iteco.cources.cqrsevent.command;

import ru.iteco.cources.cqrsevent.AccountEvent;
import ru.iteco.cources.cqrsevent.AccountEventType;
import ru.iteco.cources.cqrsevent.WidthdrawData;

public class WithdrawMoneyCommand extends AccountCommand {
    private final float money;

    public WithdrawMoneyCommand(int entityId, float money) {
        super(entityId);
        this.money = money;
    }

    public float getMoney() {
        return money;
    }

    @Override
    protected AccountEvent apply() {
        AccountEvent event = new AccountEvent(AccountEventType.WIDTHDRAW,
                getEntityId(),
                new WidthdrawData(getMoney()));

        return event;
    }
}
