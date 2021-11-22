package ru.iteco.cources.poeaa.layer.service.stubs;

import ru.iteco.cources.poeaa.layer.Order;
import ru.iteco.cources.poeaa.layer.service.PaymentService;

public class PaymentServiceStub implements PaymentService {
    @Override
    public void payForOrder(Order order, float sum) {
        //TODO fake logic
    }
}
