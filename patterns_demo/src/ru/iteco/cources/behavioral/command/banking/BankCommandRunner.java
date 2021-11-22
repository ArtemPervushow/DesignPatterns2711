package ru.iteco.cources.behavioral.command.banking;

public class BankCommandRunner {
    private final float wheatCourse = 0.23f;
    private final float bankMargin = 0.4f;

    private float bankBalance;
    private float wheatBalance;
    private BankCommandHistory commandHistory = new BankCommandHistory();

    public float getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(float bankBalance) {
        this.bankBalance = bankBalance;
    }

    public float getWheatBalance() {
        return wheatBalance;
    }

    public void setWheatBalance(float wheatBalance) {
        this.wheatBalance = wheatBalance;
    }

    public float getWheatCourse() {
        return wheatCourse;
    }

    public float getBankMargin() {
        return bankMargin;
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
