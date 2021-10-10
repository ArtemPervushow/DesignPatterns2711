package ru.iteco.cources.behavioral.command.banking;

public class OfferCreditOperation extends BankOperation {
    public OfferCreditOperation(Bank bank, float sum) {
        super(bank, sum);
    }

    @Override
    protected boolean execute() {
        if(bank.getBalance() - sum >= 0 ){
            bank.withdrawMoneyFromBalance(sum);

            return true;
        }

        return false;
    }

    @Override
    public void undo() {
        bank.appendMoneyToBalance(sum);
    }
}
