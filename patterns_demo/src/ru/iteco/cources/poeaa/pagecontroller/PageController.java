package ru.iteco.cources.poeaa.pagecontroller;

import ru.iteco.cources.poeaa.pagecontroller.model.Model;
import ru.iteco.cources.poeaa.pagecontroller.model.Product;
import ru.iteco.cources.poeaa.pagecontroller.model.User;
import ru.iteco.cources.poeaa.pagecontroller.view.ProductView;
import ru.iteco.cources.poeaa.pagecontroller.view.UserView;

public class PageController {
    private Model model;

    public PageController(Model model) {
        this.model = model;
    }

    public void addUserRequest(String name, boolean sex, short age) {
        User user = new User(name, sex, age);

        model.addUser(user);
    }

    public void addProductRequest(String name, int count, float price) {
        Product product = new Product(name, count, price);

        model.addProduct(product);
    }

    public void showDataRequest(String name, DataTypeEnum typeEnum) {
        switch (typeEnum) {
            case USER:
                UserView userView = new UserView();
                userView.showUser(model.getUserByName(name));
                break;
            case PRODUCT:
                ProductView productView = new ProductView();
                productView.showProduct(model.getProductByName(name));
                break;
        }
    }
}
