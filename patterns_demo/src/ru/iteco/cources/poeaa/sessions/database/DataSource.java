package ru.iteco.cources.poeaa.sessions.database;

import ru.iteco.cources.poeaa.sessions.Basket;

import java.util.HashMap;
import java.util.Map;

public class DataSource {
    //good for distributed apps
    //complex
    //most slow method
    private Map<String, Basket> basketMap = new HashMap<>();

    public void storeRequestToDB(String request) {
        String clientId = getClientIdFromRequest(request);

        Basket currentUserBasket = basketMap.get(clientId);
        if(currentUserBasket == null){
            currentUserBasket = new Basket();
            basketMap.put(clientId, currentUserBasket);
        }

        currentUserBasket.addProduct(request);
    }

    private String getClientIdFromRequest(String request) {
        return "1";
    }
}
