package ru.iteco.cources.poeaa.datasource.mappers;

import ru.iteco.cources.poeaa.datasource.Product;

import java.util.List;

public interface ProductMapper {
    Object getSourceFromProduct(Product product);
    Product getProductFromSource(Object source);
    List<Object> getListSourcesFromProducts(List<Product> productList);
    List<Product> getListProductsFromSources(List<Object> sourceList);
}
