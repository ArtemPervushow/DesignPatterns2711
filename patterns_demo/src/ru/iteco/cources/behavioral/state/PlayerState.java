package ru.iteco.cources.behavioral.state;

public abstract class PlayerState {
    Player player;

    public PlayerState(Player player) {
        this.player = player;
    }

    public abstract String onLock();
    public abstract String onPlay();
    public abstract String onPause();
    public abstract String onOff();
}
