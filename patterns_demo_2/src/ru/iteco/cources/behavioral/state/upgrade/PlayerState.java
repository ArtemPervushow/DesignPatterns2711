package ru.iteco.cources.behavioral.state.upgrade;

public abstract class PlayerState {
    Player player;

    public PlayerState(Player player) {
        this.player = player;
    }

    public abstract PlayerState onOff();
    public abstract PlayerState onPlay();
    public abstract PlayerState onPause();
    public abstract PlayerState onLock();
}
