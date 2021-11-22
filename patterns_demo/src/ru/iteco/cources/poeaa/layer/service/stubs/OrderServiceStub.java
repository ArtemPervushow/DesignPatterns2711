package ru.iteco.cources.poeaa.layer.service.stubs;

import ru.iteco.cources.poeaa.layer.Order;
import ru.iteco.cources.poeaa.layer.Product;
import ru.iteco.cources.poeaa.layer.service.OrderService;

public class OrderServiceStub implements OrderService {
    @Override
    public void createOrder(Order order) {

    }

    @Override
    public Order getOrderById(long id) {
        //return fake data
        return new Order(1l, 100f);
    }

    @Override
    public void addProductToOrder(Product product, long orderId) throws Exception {

    }

    @Override
    public boolean validateOrder(Order order) {
        return false;
    }
}
