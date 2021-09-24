package ru.iteco.cources.structural.bridge;

public class Tv implements Device {
    private boolean on = false;
    private int volume = 20;
    private int chanel = 1;
    private boolean isChildOnTv;

    public Tv(boolean isChildOnTv) {
        this.isChildOnTv = isChildOnTv;
    }

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
    }

    @Override
    public void disable() {
        on = false;
    }

    @Override
    public void setVolume(int percent) {
        if(percent > 100) {
            this.volume = 100;
        } else if(percent < 0) {
            this.volume = 0;
        } else {
            this.volume = percent;
        }
    }

    @Override
    public int getChanel() {
        return chanel;
    }

    @Override
    public void setChanel(int chanel) {
        if(isChildOnTv && chanel > 199){
            System.out.println("Adult content disappeared!!!");
            return;
        }
        this.chanel = chanel;
    }

    @Override
    public int getVolume() {
        return volume;
    }
}
