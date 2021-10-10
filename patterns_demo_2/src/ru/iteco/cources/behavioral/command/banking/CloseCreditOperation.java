package ru.iteco.cources.behavioral.command.banking;

public class CloseCreditOperation extends BankOperation {
    public CloseCreditOperation(Bank bank, float sum) {
        super(bank, sum);
    }

    @Override
    protected boolean execute() {
        bank.appendMoneyToBalance(sum);

        return true;
    }

    @Override
    public void undo() {
        if(bank.getBalance() - sum >= 0) {
            bank.withdrawMoneyFromBalance(sum);
        } else {
            System.out.println("Not enought money for cancel!");
        }
    }
}
