package ru.iteco.cources.behavioral.command.banking;

import java.math.BigDecimal;

public abstract class BankCommand {
    BankCommandRunner runner;
    private BigDecimal balance = BigDecimal.ZERO;

    public BankCommand(BankCommandRunner runner) {
        this.runner = runner;
    }

    public abstract boolean execute();

    void backup() {
        balance = runner.getBankBalance();
    }

    public void undo() {
        runner.setBankBalance(balance);
    }
}
