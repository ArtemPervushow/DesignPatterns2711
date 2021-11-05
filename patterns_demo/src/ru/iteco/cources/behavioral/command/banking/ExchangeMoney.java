package ru.iteco.cources.behavioral.command.banking;

import java.math.BigDecimal;

public class ExchangeMoney extends BankCommand{
    private BigDecimal cost;

    public ExchangeMoney(BankCommandRunner runner, BigDecimal cost) {
        super(runner);
        this.cost = cost;
    }

    @Override
    public boolean execute() {
        runner.setBankBalance(runner.getBankBalance().multiply(cost));
        return true;
    }
}
