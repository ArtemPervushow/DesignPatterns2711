package ru.iteco.cources.poeaa.layer.service;

import ru.iteco.cources.poeaa.layer.Order;
import ru.iteco.cources.poeaa.layer.Product;

public interface OrderService {
    void createOrder(Order order);
    Order getOrderById(long id);
    void addProductToOrder(Product product, long orderId) throws Exception;
    boolean validateOrder(Order order);
}
