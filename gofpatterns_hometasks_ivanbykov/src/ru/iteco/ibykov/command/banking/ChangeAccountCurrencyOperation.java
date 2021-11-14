package ru.iteco.ibykov.command.banking;

public class ChangeAccountCurrencyOperation extends BankOperation{
    public ChangeAccountCurrencyOperation(Bank bank, float sum)
    {
        super(bank,sum);
    }
    @Override
    protected boolean execute() {
        this.sum=sum/75;
        return true;
    }

    @Override
    public void undo() {
        this.sum=sum*75;
    }
}
