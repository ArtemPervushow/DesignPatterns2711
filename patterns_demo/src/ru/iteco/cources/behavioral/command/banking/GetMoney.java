package ru.iteco.cources.behavioral.command.banking;

public class GetMoney extends BankCommand {
    private float sum;

    public GetMoney(BankCommandRunner runner, float sum) {
        super(runner);
        this.sum = sum;
    }

    @Override
    public boolean execute() {
        if(runner.getBankBalance() - sum >= 0) {
            runner.setBankBalance(runner.getBankBalance() - sum);
            return true;
        } else {
            System.out.println("Not enought money!");
        }
        return false;
    }
}
