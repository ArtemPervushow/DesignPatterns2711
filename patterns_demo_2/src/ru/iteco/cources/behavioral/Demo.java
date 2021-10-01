package ru.iteco.cources.behavioral;

import ru.iteco.cources.behavioral.observer.NewsPublisher;
import ru.iteco.cources.behavioral.observer.NewsSpectator;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        NewsPublisher foxNews = new NewsPublisher("FoxNews");
        NewsPublisher cnn = new NewsPublisher("cnn");

        NewsSpectator spectator1 = new NewsSpectator("Artem");
        NewsSpectator spectator2 = new NewsSpectator("Denis");
        NewsSpectator spectator3 = new NewsSpectator("Egor");
        NewsSpectator spectator4 = new NewsSpectator("Kate");
        NewsSpectator spectator5 = new NewsSpectator("Olga");


        foxNews.registerSubscriber(spectator1);
        foxNews.registerSubscriber(spectator2);
        foxNews.registerSubscriber(spectator3);

        cnn.registerSubscriber(spectator4);
        cnn.registerSubscriber(spectator5);

        for (int i = 0; i < 100; i++) {
            Thread.sleep(1000);

            if(i == 49) {
                foxNews.removeSubscriber(spectator3);
                cnn.registerSubscriber(spectator3);
            }

            if(i == 70) {
                foxNews.registerSubscriber(spectator5);
            }
            foxNews.notifyAllSubscribers();
            cnn.notifyAllSubscribers();
        }
    }
}
