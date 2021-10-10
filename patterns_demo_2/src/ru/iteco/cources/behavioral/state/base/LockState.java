package ru.iteco.cources.behavioral.state.base;

public class LockState extends PlayerState {
    public LockState(Player player) {
        super(player);
    }

    @Override
    public String onOff() {
        player.setState(new OffState(player));
        return "Off!";
    }

    @Override
    public String onPlay() {
        System.out.println("We are locked now!");
        return "Lock!";
    }

    @Override
    public String onPause() {
        System.out.println("We are locked now!");
        return "Lock!";
    }

    @Override
    public String onLock() {
        player.setState(new PauseState(player));
        return "Pause!";
    }
}
