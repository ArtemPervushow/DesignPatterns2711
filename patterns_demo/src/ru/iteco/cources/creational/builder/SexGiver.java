package ru.iteco.cources.creational.builder;

import java.util.Random;

public class SexGiver {
    private static Random random = new Random();

    public static boolean getSex() throws Exception {
        int position = random.nextInt(100) - 50;
        if(position == 0) {
            throw new Exception("Sex unknown!");
        }

        return position > 0;
    }
}
