package ru.iteco.cources.behavioral.command.banking;

import java.math.BigDecimal;

public class GetMoney extends BankCommand {
    private float sum;

    public GetMoney(BankCommandRunner runner, float sum) {
        super(runner);
        this.sum = sum;
    }

    @Override
    public boolean execute() {
        if (runner.getBankBalance().subtract(BigDecimal.valueOf(sum)).compareTo(BigDecimal.ZERO) >= 0) {
            runner.setBankBalance(runner.getBankBalance().subtract(BigDecimal.valueOf(sum)));
            return true;
        } else {
            System.out.println("Not enought money!");
        }
        return false;
    }
}
