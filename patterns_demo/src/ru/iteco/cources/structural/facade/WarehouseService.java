package ru.iteco.cources.structural.facade;

public class WarehouseService {
    public boolean reserveProduct(Product product, int count){
        System.out.println("Product " + product + " in count of " + count + " reserved");
        return count > 0;
    }
}
