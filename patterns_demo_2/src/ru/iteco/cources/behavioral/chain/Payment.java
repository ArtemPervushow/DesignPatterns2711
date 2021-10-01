package ru.iteco.cources.behavioral.chain;

public class Payment {
    private String payeer;
    private float sum;
    private String currentStage;
    private String info;

    public Payment(String payeer, float sum, String currentStage, String info) {
        this.payeer = payeer;
        this.sum = sum;
        this.currentStage = currentStage;
        this.info = info;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "payeer='" + payeer + '\'' +
                ", sum=" + sum +
                ", currentStage='" + currentStage + '\'' +
                ", info='" + info + '\'' +
                '}';
    }

    public String getPayeer() {
        return payeer;
    }

    public void setPayeer(String payeer) {
        this.payeer = payeer;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }

    public String getCurrentStage() {
        return currentStage;
    }

    public void setCurrentStage(String currentStage) {
        this.currentStage = currentStage;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void appendInfo(String newInfo){
        this.info += newInfo;
    }
}
