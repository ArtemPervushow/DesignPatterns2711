package ru.iteco.cources.poeaa.sessions.client;

import ru.iteco.cources.poeaa.sessions.Basket;

public class FrontEnd {
    private BackEnd backEnd;
    //not secure
    //hard to store on client
    //simple
    private Basket basket;

    public FrontEnd(BackEnd backEnd) {
        this.backEnd = backEnd;
        basket = new Basket();
    }

    public void handleUserRequest(String request) {
        backEnd.handleRequestFromFront(request);

        fillBasketUsingRequest(request);
    }

    private void fillBasketUsingRequest(String request) {
        basket.addProduct(request);
    }
}
