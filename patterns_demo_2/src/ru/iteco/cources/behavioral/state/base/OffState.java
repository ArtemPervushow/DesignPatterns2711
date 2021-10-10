package ru.iteco.cources.behavioral.state.base;

public class OffState extends PlayerState {
    public OffState(Player player) {
        super(player);
    }

    @Override
    public String onOff() {
        player.setState(new PauseState(player));
        return "Pause!";
    }

    @Override
    public String onPlay() {
        System.out.println("We are off now!");
        return "Off!";
    }

    @Override
    public String onPause() {
        System.out.println("We are off now!");
        return "Off!";
    }

    @Override
    public String onLock() {
        System.out.println("We are off now!");
        return "Off!";
    }
}
