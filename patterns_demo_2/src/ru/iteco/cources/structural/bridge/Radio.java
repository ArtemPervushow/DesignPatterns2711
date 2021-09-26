package ru.iteco.cources.structural.bridge;

public class Radio implements Device {
    private boolean enabled;
    private int volume;
    private int channel = 1;

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void enable() {
        this.enabled = true;
    }

    @Override
    public void disable() {
        this.enabled = false;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(int volume) {
        if(volume >= 100) {
            this.volume = 100;
            return;
        } else if(volume < 0) {
            this.volume = 0;
            return;
        }

        this.volume =  volume;
    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public void setChannel(int chanel) {
        if(chanel >= 50) {
            this.channel = 50;
            return;
        } else if(chanel < 0) {
            this.channel = 0;
            return;
        }

        this.channel =  chanel;
    }
}
