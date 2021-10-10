package ru.iteco.cources.behavioral.state;

public class LockedState extends PlayerState {
    public LockedState(Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        if(player.isPlaying()) {
            player.setPlaying(false);
            player.setCurrentState(new PauseState(player));

            return "Stop playing. Pause";
        }

        return "locked!";
    }

    @Override
    public String onPlay() {
        player.setCurrentState(new PlayingState(player));
        return "Playing!";
    }

    @Override
    public String onPause() {
        return "locked!";
    }

    @Override
    public String onOff() {
        player.setCurrentState(new OffState(player));

        return "off";
    }
}
