package ru.iteco.cources.behavioral.command.banking;

public abstract class BankOperation {
    protected Bank bank;
    protected float sum;

    public BankOperation(Bank bank, float sum) {
        this.bank = bank;
        this.sum = sum;
    }

    protected abstract boolean execute();

    public abstract void undo();
}
