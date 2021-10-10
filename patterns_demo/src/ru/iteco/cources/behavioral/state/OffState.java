package ru.iteco.cources.behavioral.state;

public class OffState extends PlayerState {
    public OffState(Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        return "off!";
    }

    @Override
    public String onPlay() {
        return "off!";
    }

    @Override
    public String onPause() {
        return "off!";
    }

    @Override
    public String onOff() {
        player.setCurrentState(new PauseState(player));
        return "pause!";
    }
}
