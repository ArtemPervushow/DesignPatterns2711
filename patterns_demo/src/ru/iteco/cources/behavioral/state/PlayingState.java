package ru.iteco.cources.behavioral.state;

public class PlayingState extends PlayerState {
    public PlayingState(Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        player.setCurrentState(new LockedState(player));
        return "locked!";
    }

    @Override
    public String onPlay() {
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
