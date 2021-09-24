package ru.iteco.cources.structural.bridge;

public class Radio implements Device {
    private boolean on = false;
    private int volume = 20;
    private int chanel = 1;

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
        chanel = 1;
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
    public int getVolume() {
        return volume;
    }

    @Override
    public int getChanel() {
        return chanel;
    }

    @Override
    public void setChanel(int chanel) {
        this.chanel = chanel;
    }
}
