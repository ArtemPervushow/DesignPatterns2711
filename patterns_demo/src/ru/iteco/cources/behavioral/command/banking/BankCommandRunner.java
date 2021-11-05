package ru.iteco.cources.behavioral.command.banking;

import java.math.BigDecimal;

public class BankCommandRunner {
    private BigDecimal bankBalance = BigDecimal.ZERO;
    private BankCommandHistory commandHistory = new BankCommandHistory();

    public BigDecimal getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(BigDecimal bankBalance) {
        this.bankBalance = bankBalance;
    }

    public void runCommand(BankCommand command) {
        command.backup();
        if(command.execute()) {
            commandHistory.push(command);
        }
    }

    public void undo() {
        if(commandHistory.isEmpty()){
            return;
        }

        BankCommand command = commandHistory.pop();
        if(command != null) {
            command.undo();
        }
    }
}
