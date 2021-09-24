package ru.iteco.cources.structural.bridge;

public class BaseRemote implements Remote {
    protected Device device;

    public BaseRemote(Device device) {
        this.device = device;
    }

    @Override
    public void toggle() {
        if(device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    @Override
    public void volumeUp() {
        device.setVolume(device.getVolume() + 1);
    }

    @Override
    public void volumeDown() {
        device.setVolume(device.getVolume() - 1);
    }

    @Override
    public void chanelUp() {
        device.setChanel(device.getChanel() + 1);
    }

    @Override
    public void chanelDown() {
        device.setChanel(device.getChanel() - 1);
    }
}
