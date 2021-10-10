package ru.iteco.cources.behavioral.state.upgrade;

public class Demo {
    public static void main(String[] args) {
        Player player = new Player();

        player.getState()
                .onPlay()
                .onPause()
                .onLock()
                .onLock()
                .onPlay()
                .onOff()
                .onPlay();
    }
}
