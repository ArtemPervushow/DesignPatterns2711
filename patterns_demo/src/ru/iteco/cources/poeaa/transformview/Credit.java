package ru.iteco.cources.poeaa.transformview;

public class Credit {
    private float creditBalance;
    private String scoreNumber;
    private String creditNumber;

    public Credit(float creditBalance, String scoreNumber, String creditNumber) {
        this.creditBalance = creditBalance;
        this.scoreNumber = scoreNumber;
        this.creditNumber = creditNumber;
    }

    public float getCreditBalance() {
        return creditBalance;
    }

    public void setCreditBalance(float creditBalance) {
        this.creditBalance = creditBalance;
    }

    public String getScoreNumber() {
        return scoreNumber;
    }

    public void setScoreNumber(String scoreNumber) {
        this.scoreNumber = scoreNumber;
    }

    public String getCreditNumber() {
        return creditNumber;
    }

    public void setCreditNumber(String creditNumber) {
        this.creditNumber = creditNumber;
    }
}
