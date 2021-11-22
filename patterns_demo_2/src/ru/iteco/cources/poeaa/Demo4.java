package ru.iteco.cources.poeaa;

import ru.iteco.cources.poeaa.pagecontroller.Model;
import ru.iteco.cources.poeaa.pagecontroller.PageController;

public class Demo4 {
    public static void main(String[] args) {
        Model model = new Model();
        PageController pageController = new PageController();
        pageController.setModel(model);

        pageController.displayViewWithText("Artem");
        pageController.displayViewWithText("Kate");
        pageController.displayViewWithText("Kate");
    }
}
