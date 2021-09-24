package ru.iteco.cources.structural.facade;

import java.util.Map;

public class OrderService implements OrderFacade {
    private WarehouseService warehouseService = new WarehouseService();
    private PaymentService paymentService = new PaymentService();
    private DeliveryService deliveryService = new DeliveryService();

    @Override
    public boolean makeAnOrder(Order order) {
        Map<Product, Integer> productMap = order.getProductMap();
        boolean success = true;
        for (Product product:
                productMap.keySet()) {
            success = warehouseService.reserveProduct(product,
                                                      productMap.get(product));
            if(!success) {
                return false;
            }
        }

        for (Product product : productMap.keySet()) {
            success = paymentService.payForProduct(product.getName(),
                                         product.getCost() * productMap.get(product));
            if(!success) {
                return false;
            }
        }

        for (Product product:
             productMap.keySet()) {
            deliveryService.makeDeliver(order.getCustomerName(),
                                                  product.getName(),
                                                  productMap.get(product));
        }

        return success;
    }
}
