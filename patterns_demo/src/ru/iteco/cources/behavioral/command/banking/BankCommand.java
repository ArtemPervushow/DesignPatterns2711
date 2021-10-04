package ru.iteco.cources.behavioral.command.banking;

public abstract class BankCommand {
    BankCommandRunner runner;
    private float balance;
    private float wheat;

    public BankCommand(BankCommandRunner runner) {
        this.runner = runner;
    }

    public abstract boolean execute();

    void backup() {
        balance = runner.getBankBalance();
        wheat = runner.getWheatBalance();
    }

    public void undo() {
        runner.setBankBalance(balance);
        runner.setWheatBalance(wheat);
    }
}
