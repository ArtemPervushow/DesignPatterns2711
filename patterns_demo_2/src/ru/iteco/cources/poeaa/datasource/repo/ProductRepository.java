package ru.iteco.cources.poeaa.datasource.repo;

import ru.iteco.cources.poeaa.datasource.model.Product;

import java.util.List;
import java.util.UUID;

public interface ProductRepository {
    //C
    boolean createProduct(Product Product);
    int createBatchProducts(List<Product> Products);

    //R
    Product getByUUID(UUID uuid);
    List<Product> gelAll();
    List<Product> getByFilter(String[] fields);// {"name", "Artem", "age", "31"}
    List<Product> getByCondition(String[] conditions);// {"age", ">", "17"}

    //U
    boolean updateProduct(Product Product);
    int updateBatchProducts(List<Product> Products);

    //D
    boolean deleteProduct(Product Product);
    int deleteBatchProducts(List<Product> Products);

    //D+
    int deleteProductsByFilter(String[] fields);
    int deleteProductsByCondition(String[] conditions);

    //Additional
    Product getProductByName(String name);

    Product getProductForAdultUsers();
}
