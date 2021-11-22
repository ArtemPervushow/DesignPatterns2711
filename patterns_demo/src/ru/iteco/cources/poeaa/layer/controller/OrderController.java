package ru.iteco.cources.poeaa.layer.controller;

import ru.iteco.cources.poeaa.layer.Order;
import ru.iteco.cources.poeaa.layer.Product;
import ru.iteco.cources.poeaa.layer.service.OrderServiceImpl;
import ru.iteco.cources.poeaa.layer.service.PaymentService;
import ru.iteco.cources.poeaa.layer.service.PaymentServiceImpl;
import ru.iteco.cources.poeaa.layer.service.ProductService;
import ru.iteco.cources.poeaa.layer.service.stubs.PaymentServiceStub;

public class OrderController {
    private OrderServiceImpl orderServiceImpl = new OrderServiceImpl();
    private PaymentService paymentServiceImpl = new PaymentServiceStub();
    private ProductService productService = new ProductService();

    public void createOrder(Order order) {
        orderServiceImpl.createOrder(order);
    }

    public void payOrder(Long id, float sum) throws Exception {
        if(id <= 0 || sum <= 0) {
            throw new Exception("Bad request");
        }
        Order order = orderServiceImpl.getOrderById(id);
        paymentServiceImpl.payForOrder(order, sum);
    }

    public void addProductToOrder(long orderId,
                                  Product product,
                                  short count) throws Exception {
        if(orderId <= 0 || count <= 0) {
            throw new Exception("Bad request");
        }
        if(!productService.isEnoughProduct(product, count)){
            throw new Exception("Product not enought!");
        }
        for (int i = 0; i < count; i++) {
            //TODO solve multi hit db problem
            orderServiceImpl.addProductToOrder(product,orderId);
        }
    }

    public void removeProductFromOrder(long orderId,
                                       Product product) {

    }

    public void changeProductCountInOrder(long orderId,
                                          Product product,
                                          short count) {

    }
}
