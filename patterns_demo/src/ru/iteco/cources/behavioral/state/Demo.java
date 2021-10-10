package ru.iteco.cources.behavioral.state;

public class Demo {
    public static void main(String[] args) {
        Player player = new Player();

        System.out.println(player.getCurrentState().onOff());
        System.out.println(player.getCurrentState().onOff());
        System.out.println(player.getCurrentState().onPlay());
        System.out.println(player.getCurrentState().onPause());
        System.out.println(player.getCurrentState().onLock());
    }
}
