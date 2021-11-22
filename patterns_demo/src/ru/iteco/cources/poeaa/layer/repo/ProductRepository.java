package ru.iteco.cources.poeaa.layer.repo;

import ru.iteco.cources.poeaa.layer.Product;

import java.util.List;
import java.util.UUID;

public interface ProductRepository {
    //C
    boolean insertProduct(Product product);
    int insertBatchProduct(List<Product> productList);

    //R
    List<Product> getAll();
    List<Product> getByFilter(String[] args);
    List<Product> getWithCondition(String[] args);
    Product getByUUID(UUID uuid);

    //U
    boolean updateProduct(Product product);
    int updateBatchProduct(List<Product> productList);

    //D
    boolean deleteProduct(Product product);
    int deleteBatchProduct(List<Product> productList);
    int deleteProductByFilter(String[] args);

    void rollback();
}
