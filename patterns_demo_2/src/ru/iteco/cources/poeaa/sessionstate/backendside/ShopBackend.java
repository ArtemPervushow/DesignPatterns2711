package ru.iteco.cources.poeaa.sessionstate.backendside;

import ru.iteco.cources.poeaa.sessionstate.Basket;

import java.util.HashMap;
import java.util.Map;

public class ShopBackend {
    private ShopDatabase shopDatabase;
    //+no client overhead
    //+could store/restore client history
    //-complex
    //-hard for distributed backend
    private Map<String, Basket> basketMap = new HashMap<>();

    public ShopBackend(ShopDatabase shopDatabase) {
        this.shopDatabase = shopDatabase;
    }

    public void processAddProduct(String product) {
        String clientID = getClientIdFromRequest(product);

        if(!basketMap.containsKey(clientID)) {
            basketMap.put(clientID, new Basket());
        }
        basketMap.get(clientID).addProduct(product);

        shopDatabase.storeProductAdding(product);
    }

    private String getClientIdFromRequest(String product) {
        return "1";
    }
}
