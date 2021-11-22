package ru.iteco.cources.poeaa.money;

public class Money {
    //or more accurate data type
    private double amount;
    private String currencyName;
    private double currencyRateToUSD;

    public Money(double amount, String currencyName, double currencyRateToUSD) {
        this.amount = amount;
        this.currencyName = currencyName;
        this.currencyRateToUSD = currencyRateToUSD;
    }

    public void changeAmount(double amountDiff) {
        amount += amountDiff;
    }

    public void changeCurrency(String newCurrencyName,
                               Double newCurrencyRate){
        currencyName = newCurrencyName;
        currencyRateToUSD = newCurrencyRate;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public double getCurrencyRateToUSD() {
        return currencyRateToUSD;
    }
}
