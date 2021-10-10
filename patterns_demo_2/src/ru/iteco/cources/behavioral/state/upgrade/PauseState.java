package ru.iteco.cources.behavioral.state.upgrade;

public class PauseState extends PlayerState {
    public PauseState(Player player) {
        super(player);
    }

    @Override
    public PlayerState onOff() {
        PlayerState playerState = new OffState(player);
        player.setState(playerState);

        return playerState;
    }

    @Override
    public PlayerState onPlay() {
        PlayerState playerState = new PlayState(player);
        player.setState(playerState);

        return playerState;
    }

    @Override
    public PlayerState onPause() {
        System.out.println("We are already on Pause!");
        return this;
    }

    @Override
    public PlayerState onLock() {
        PlayerState playerState = new LockState(player);
        player.setState(playerState);

        return playerState;
    }
}
