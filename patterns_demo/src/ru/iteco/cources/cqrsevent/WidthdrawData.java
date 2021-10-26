package ru.iteco.cources.cqrsevent;

public class WidthdrawData extends EventData {
    private final float widthdrawBalance;

    public WidthdrawData(float widthdrawBalance) {
        this.widthdrawBalance = widthdrawBalance;
    }

    public float getWidthdrawBalance() {
        return widthdrawBalance;
    }
}
