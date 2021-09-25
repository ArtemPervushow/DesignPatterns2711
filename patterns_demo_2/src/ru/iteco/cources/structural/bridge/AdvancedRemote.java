package ru.iteco.cources.structural.bridge;

public class AdvancedRemote extends BaseRemote {
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute(){
        device.setVolume(0);
    }
}
