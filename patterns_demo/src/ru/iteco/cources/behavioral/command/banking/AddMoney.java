package ru.iteco.cources.behavioral.command.banking;

public class AddMoney extends BankCommand {
    private float appendMoney;

    public AddMoney(BankCommandRunner runner, float appendMoney) {
        super(runner);
        this.appendMoney = appendMoney;
    }

    @Override
    public boolean execute() {
        runner.setBankBalance(runner.getBankBalance() + appendMoney);

        return true;
    }
}
