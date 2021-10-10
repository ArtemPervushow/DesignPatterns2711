package ru.iteco.cources.behavioral.state.upgrade;

public class PlayState extends PlayerState {
    public PlayState(Player player) {
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
        System.out.println("We are already on Play!");
        return this;
    }

    @Override
    public PlayerState onPause() {
        PlayerState playerState = new PauseState(player);
        player.setState(playerState);

        return playerState;
    }

    @Override
    public PlayerState onLock() {
        PlayerState playerState = new LockState(player);
        player.setState(playerState);

        return playerState;
    }
}
