package ru.iteco.cources.poeaa.sessions.back;

import ru.iteco.cources.poeaa.sessions.Basket;

import java.util.HashMap;
import java.util.Map;

public class BackEnd {
    private DataSource dataSource;
    //complex
    //what if distribute??? Share basketMap between apps! Or use sticky session balancer
    private Map<String, Basket> basketMap = new HashMap<>();

    public BackEnd(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void handleRequestFromFront(String request) {
        dataSource.storeRequestToDB(request);

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
