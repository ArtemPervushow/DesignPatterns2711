package ru.iteco.cources.behavioral.observer.real;


public class Demo {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        PaymentService paymentService = new PaymentService();
        WarehouseService warehouseService = new WarehouseService();
        DeliveryService deliveryService = new DeliveryService();
        SaleService saleService = new SaleService();

        orderService.addObserver(paymentService);
        orderService.addObserver(warehouseService);
        orderService.addObserver(deliveryService);
        orderService.addObserver(saleService);

        orderService.makeOrder(new Order("Skirt", 100f));
    }
}
