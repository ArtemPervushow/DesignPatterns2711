package ru.iteco.cources.microserv;

import java.util.Random;

public class AnswerService {
    private int carbage = 0;

    public String answer(String request) throws Exception {
        Random random = new Random();

        if(random.nextInt(20) == 15) {
            throw new Exception("Random error");
        }
        carbage++;

        if(carbage == 100) {
            throw new Exception("Garbage Exception");
        }

        return "The answer for " + request + " is " + random.nextInt(1000);
    }
}
