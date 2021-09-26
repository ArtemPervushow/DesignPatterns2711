package ru.iteco.cources.structural.flyweight;

public class Size {
    private String descr;
    private boolean isEuro;

    public Size(String descr, boolean isEuro) {
        this.descr = descr;
        this.isEuro = isEuro;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public boolean isEuro() {
        return isEuro;
    }

    public void setEuro(boolean euro) {
        isEuro = euro;
    }
}
