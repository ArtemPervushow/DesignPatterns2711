package ru.iteco.cources.structural.bridge;

public interface Device {
    boolean isEnabled();
    void enable();
    void disable();
    void setVolume(int percent);
    int getVolume();
    int getChanel();
    void setChanel(int chanel);
}
