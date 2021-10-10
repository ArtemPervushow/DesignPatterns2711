package ru.iteco.cources.behavioral.state.upgrade;

public class Player {
    private boolean playing;
    private PlayerState state;

    public Player() {
        state = new PauseState(this);
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public PlayerState getState() {
        return state;
    }

    public void setState(PlayerState state) {
        this.state = state;
    }
}
