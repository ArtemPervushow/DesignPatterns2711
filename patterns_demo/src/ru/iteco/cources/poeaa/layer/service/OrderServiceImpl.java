package ru.iteco.cources.poeaa.layer.service;

import ru.iteco.cources.poeaa.layer.Order;
import ru.iteco.cources.poeaa.layer.Product;

public class OrderServiceImpl implements OrderService{
    private ProductService productService = new ProductService();

    public void createOrder(Order order) {

    }

    /*public Order getOrder(String[] params) {

    }*/
    public Order getOrderById(long id) {
        return null;
    }

    public void addProductToOrder(Product product, long orderId) throws Exception {
        Order order = getOrderById(orderId);
        if(!productService.validateProduct(product)){
            throw new Exception("product bad format!");
        }
        order.getProducts().add(product);
        //TODO save order to db
    }

    public boolean validateOrder(Order order) {
        return true;
    }
}
