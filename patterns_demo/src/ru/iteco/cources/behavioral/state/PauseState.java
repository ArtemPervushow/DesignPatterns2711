package ru.iteco.cources.behavioral.state;

public class PauseState extends PlayerState {
    public PauseState(Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        player.setCurrentState(new LockedState(player));
        return "locked!";
    }

    @Override
    public String onPlay() {
        player.setCurrentState(new PlayingState(player));
        return "playing!";
    }

    @Override
    public String onPause() {
        return "pause!";
    }

    @Override
    public String onOff() {
        player.setCurrentState(new OffState(player));
        return "off!";
    }
}
