package ru.iteco.cources.behavioral.state.base;

public class PauseState extends PlayerState {
    public PauseState(Player player) {
        super(player);
    }

    @Override
    public String onOff() {
        player.setState(new OffState(player));
        return "Off!";
    }

    @Override
    public String onPlay() {
        player.setState(new PlayState(player));
        return "Play!";
    }

    @Override
    public String onPause() {
        System.out.println("We are already on Pause!");
        return "Pause!";
    }

    @Override
    public String onLock() {
        player.setState(new LockState(player));
        return "Lock!";
    }
}
