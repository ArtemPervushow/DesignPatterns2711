package ru.iteco.cources.behavioral.state.upgrade;

public class OffState extends PlayerState {
    public OffState(Player player) {
        super(player);
    }

    @Override
    public PlayerState onOff() {
        PlayerState playerState = new PauseState(player);
        player.setState(playerState);
        return playerState;
    }

    @Override
    public PlayerState onPlay() {
        System.out.println("We are off now!");
        return this;
    }

    @Override
    public PlayerState onPause() {
        System.out.println("We are off now!");
        return this;
    }

    @Override
    public PlayerState onLock() {
        System.out.println("We are off now!");
        return this;
    }
}
