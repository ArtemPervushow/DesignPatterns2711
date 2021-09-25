package ru.iteco.cources.structural.decorator;

import java.util.List;

public class Client {
    private String name;
    private float income;
    private List<Boolean> historyOfSuccessCredits;
    private List<Client> family;
    private boolean isBadClient;

    public Client(String name, float income, List<Boolean> historyOfSuccessCredits, List<Client> family, boolean isBadClient) {
        this.name = name;
        this.income = income;
        this.historyOfSuccessCredits = historyOfSuccessCredits;
        this.family = family;
        this.isBadClient = isBadClient;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", income=" + income +
                ", historyOfSuccessCredits=" + historyOfSuccessCredits +
                ", family=" + family +
                ", isBadClient=" + isBadClient +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getIncome() {
        return income;
    }

    public void setIncome(float income) {
        this.income = income;
    }

    public List<Boolean> getHistoryOfSuccessCredits() {
        return historyOfSuccessCredits;
    }

    public void setHistoryOfSuccessCredits(List<Boolean> historyOfSuccessCredits) {
        this.historyOfSuccessCredits = historyOfSuccessCredits;
    }

    public List<Client> getFamily() {
        return family;
    }

    public void setFamily(List<Client> family) {
        this.family = family;
    }

    public boolean isBadClient() {
        return isBadClient;
    }

    public void setBadClient(boolean badClient) {
        isBadClient = badClient;
    }
}
