package ru.iteco.cources.poeaa.datasource;

import ru.iteco.cources.poeaa.datasource.repo.ProductRepository;

import java.util.List;
import java.util.UUID;

public class ProductService {
    private ProductRepository productRepository;

    public Product getProductByName(String name) throws Exception {
        List<Product> products =
                productRepository.getByFilter(new String[]{"name", name});

        if(products.size() == 1) {
            return products.get(0);
        } else {
            throw new Exception("Too many products by this name");
        }
    }

    public String getProductDescription(UUID uuid) throws Exception {
        List<Product> products =
                productRepository
                        .getByFilter(new String[]{"uuid", uuid.toString()});

        if(products.size() == 1) {
            return products.get(0).toString();
        } else {
            throw new Exception("Too many products by this uuid");
        }
    }

    public void deleteProduct(UUID uuid) {
        /*Product product = productRepository.getByUUID(uuid);

        productRepository.deleteProduct(product);*/
        productRepository
                .deleteProductByFilter(new String[]{"uuid", uuid.toString()});
    }

    public void deleteProductByName(String name) throws Exception {
        int countOfDeleted = productRepository
                                .deleteProductByFilter(new String[]{"name", name});

        if(countOfDeleted > 1) {
            productRepository.rollback();
            throw new Exception("Too many products for delete by this uuid");
        }
    }

    public void addNewProduct(Product product) throws Exception {
        if(!productRepository.insertProduct(product)){
            throw new Exception("Unsuccess product insert");
        }
    }

    public void updateProduct(Product product) throws Exception {
        if(!productRepository.updateProduct(product)){
            throw new Exception("Unsuccess product update");
        }
    }

    public List<Product> getCheapProducts(float middleCost) {
        /*List<Product> allProduct = productRepository.getAll();

        return allProduct
                .stream()
                .filter(prod -> prod.getCost() < middleCost)
                .collect(Collectors.toList());*/
        return productRepository
                    .getWithCondition(new String[]{"cost", "<", middleCost+""});
    }
}
