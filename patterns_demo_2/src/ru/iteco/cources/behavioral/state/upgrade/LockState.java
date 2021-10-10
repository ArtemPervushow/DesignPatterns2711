package ru.iteco.cources.behavioral.state.upgrade;

public class LockState extends PlayerState {
    public LockState(Player player) {
        super(player);
    }

    @Override
    public PlayerState onOff() {
        PlayerState newState = new OffState(player);
        player.setState(newState);

        return newState;
    }

    @Override
    public PlayerState onPlay() {
        System.out.println("We are locked now!");
        return this;
    }

    @Override
    public PlayerState onPause() {
        System.out.println("We are locked now!");
        return this;
    }

    @Override
    public PlayerState onLock() {
        PlayerState playerState = new PauseState(player);
        player.setState(playerState);
        return playerState;
    }
}
