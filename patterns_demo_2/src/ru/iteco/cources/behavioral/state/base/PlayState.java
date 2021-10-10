package ru.iteco.cources.behavioral.state.base;

public class PlayState extends PlayerState {
    public PlayState(Player player) {
        super(player);
    }

    @Override
    public String onOff() {
        player.setState(new OffState(player));
        return "Off!";
    }

    @Override
    public String onPlay() {
        System.out.println("We are already on Play!");
        return "Play!";
    }

    @Override
    public String onPause() {
        player.setState(new PauseState(player));
        return "Pause!";
    }

    @Override
    public String onLock() {
        player.setState(new LockState(player));
        return "Lock!";
    }
}
