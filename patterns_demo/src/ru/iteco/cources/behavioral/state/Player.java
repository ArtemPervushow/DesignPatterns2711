package ru.iteco.cources.behavioral.state;

public class Player {
    private PlayerState currentState;
    private boolean playing = false;

    public Player() {
        currentState = new LockedState(this);
    }

    public PlayerState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(PlayerState currentState) {
        this.currentState = currentState;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }
}
