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
    public void channelUp() {
        device.setChannel(device.getChannel() + 1);
    }

    @Override
    public void channelDown() {
        device.setChannel(device.getChannel() - 1);
    }

    @Override
    public void volumeUp() {
        device.setVolume(device.getVolume() + 1);
    }

    @Override
    public void volumeDown() {
        device.setVolume(device.getVolume() - 1);
    }
}
