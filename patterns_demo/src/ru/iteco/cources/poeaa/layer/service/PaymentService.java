package ru.iteco.cources.poeaa.layer.service;

import ru.iteco.cources.poeaa.layer.Order;

public interface PaymentService {
    void payForOrder(Order order, float sum);
}
