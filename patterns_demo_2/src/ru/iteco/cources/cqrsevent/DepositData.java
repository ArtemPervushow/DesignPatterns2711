package ru.iteco.cources.cqrsevent;

public class DepositData extends EventData {
    private final float appendBalance;

    public DepositData(float appendBalance) {
        this.appendBalance = appendBalance;
    }

    public float getAppendBalance() {
        return appendBalance;
    }
}
