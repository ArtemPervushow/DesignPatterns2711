package ru.iteco.cources.poeaa.sessionstate.databaseside;

import ru.iteco.cources.poeaa.sessionstate.Basket;

import java.util.HashMap;
import java.util.Map;

public class ShopDatabase {
    //+no client overhead
    //+could store/restore client history
    //-complex
    //-slow
    private Map<String, Basket> basketMap = new HashMap<>();

    public void storeProductAdding(String product) {
        String clientID = getClientIdFromRequest(product);

        if(!basketMap.containsKey(clientID)) {
            basketMap.put(clientID, new Basket());
        }
        basketMap.get(clientID).addProduct(product);
    }

    private String getClientIdFromRequest(String product) {
        return "1";
    }
}
