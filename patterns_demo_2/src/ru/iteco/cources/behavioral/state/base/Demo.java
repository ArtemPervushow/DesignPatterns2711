package ru.iteco.cources.behavioral.state.base;

import java.util.Random;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Player player = new Player();

        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            Thread.sleep(1000);
            switch (random.nextInt(4)) {
                case 0:
                    System.out.println("Tap lock");
                    System.out.println(player.getState().onLock());
                    break;
                case 1:
                    System.out.println("Tap off");
                    System.out.println(player.getState().onOff());
                    break;
                case 2:
                    System.out.println("Tap Pause");
                    System.out.println(player.getState().onPause());
                    break;
                case 3:
                    System.out.println("Tap Play");
                    System.out.println(player.getState().onPlay());
                    break;
            }
        }
    }
}
