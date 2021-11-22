package ru.iteco.cources.poeaa.datasource.mappers;

import ru.iteco.cources.poeaa.datasource.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ImitatorProductMapper implements ProductMapper {
    @Override
    public Object getSourceFromProduct(Product product) {
        return product.toString();
    }

    @Override
    public Product getProductFromSource(Object source) {
        String clearProdStr = source.toString().replace(",","")
                                               .replace("{", "")
                                               .replace("}","");

        for (String field:
                clearProdStr.split("=")) {
            //here is logic to create Product from string
        }

        return new Product(UUID.randomUUID(),
                "Bread",
                100.0f,
                10,
                UUID.randomUUID());
    }

    @Override
    public List<Object> getListSourcesFromProducts(List<Product> productList) {
        List<Object> sources = new ArrayList<>();

        for (Product product:
             productList) {
            sources.add(product.toString());
        }

        return sources;
    }

    @Override
    public List<Product> getListProductsFromSources(List<Object> sourceList) {
        List<Product> productList = new ArrayList<>();

        for (Object source:
            sourceList ) {
            productList.add(this.getProductFromSource(source));
        }

        return productList;
    }
}
