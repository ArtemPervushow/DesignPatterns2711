package ru.iteco.cources.behavioral.command.banking;

public class BankCommandRunner {
    private float bankBalance;
    private BankCommandHistory commandHistory = new BankCommandHistory();

    public float getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(float bankBalance) {
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
