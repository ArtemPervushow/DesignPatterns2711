package ru.iteco.cources.behavioral.observer;

import ru.iteco.cources.behavioral.observer.simple.Screen;
import ru.iteco.cources.behavioral.observer.simple.Sensor;

import java.util.Random;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Sensor sensor1 = new Sensor();
        Sensor sensor2=  new Sensor();

        Screen screen1 = new Screen("1");
        Screen screen2 = new Screen("2");
        Screen screen3 = new Screen("3");
        Screen screen4 = new Screen("4");

        sensor1.registerObserver(screen1);
        sensor1.registerObserver(screen2);

        sensor2.registerObserver(screen3);
        sensor2.registerObserver(screen4);

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            if(i == 9) {
                sensor1.deleteObserver(screen1);
                sensor2.registerObserver(screen1);
            }

            sensor1.setData(random.nextInt() + " ");
            sensor2.setData(random.nextInt() + " ");

            sensor1.notifyAllObservers();
            sensor2.notifyAllObservers();
            Thread.sleep(1000);
        }
    }
}
