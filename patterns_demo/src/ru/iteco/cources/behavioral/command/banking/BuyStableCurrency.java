package ru.iteco.cources.behavioral.command.banking;

public class BuyStableCurrency extends BankCommand {
    private float wheatAmount;

    public BuyStableCurrency(BankCommandRunner runner, float wheatAmount) {
        super(runner);
        this.wheatAmount = wheatAmount;
    }

    @Override
    public boolean execute() {
        final float wheatCost = wheatAmount * runner.getWheatCourse();
        final float wheatConversionCost = wheatCost * runner.getBankMargin();
        final float totalCost = wheatCost + wheatConversionCost;
        if (runner.getBankBalance() < totalCost) {
            System.out.println("Not enought money!");
            return false;
        }
        runner.setBankBalance(runner.getBankBalance() - totalCost);
        runner.setWheatBalance(runner.getWheatBalance() + wheatAmount);

        return true;
    }
}
