package ru.iteco.cources.poeaa.datasource.repo;

import ru.iteco.cources.poeaa.datasource.DbImitator;
import ru.iteco.cources.poeaa.datasource.Product;
import ru.iteco.cources.poeaa.datasource.mappers.ImitatorProductMapper;
import ru.iteco.cources.poeaa.datasource.mappers.ProductMapper;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class ProductRepositoryOnImitator implements ProductRepository {
    private DbImitator imitator = new DbImitator();
    private ProductMapper mapper = new ImitatorProductMapper();

    @Override
    public boolean insertProduct(Product product) {
        imitator.updateSomeBySQL(mapper
                                    .getSourceFromProduct(product).toString());

        return true;
    }

    @Override
    public int insertBatchProduct(List<Product> productList) {
        imitator.updateSomeBySQL(mapper
                                    .getListSourcesFromProducts(productList).toString());
        return productList.size();
    }

    @Override
    public List<Product> getAll() {
        String result = imitator.getListObjectsBySQL("Product");

        List<Product> resultProductList =
                mapper.getListProductsFromSources(Arrays
                                                    .asList(result.split("Product")));

        return resultProductList;
    }

    @Override
    public List<Product> getByFilter(String[] args) {
        return null;
    }

    @Override
    public List<Product> getWithCondition(String[] args) {
        return null;
    }

    @Override
    public Product getByUUID(UUID uuid) {
        return null;
    }

    @Override
    public boolean updateProduct(Product product) {
        return false;
    }

    @Override
    public int updateBatchProduct(List<Product> productList) {
        return 0;
    }

    @Override
    public boolean deleteProduct(Product product) {
        return false;
    }

    @Override
    public int deleteBatchProduct(List<Product> productList) {
        return 0;
    }

    @Override
    public int deleteProductByFilter(String[] args) {
        return 0;
    }

    @Override
    public void rollback() {

    }
}
