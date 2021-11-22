package ru.iteco.cources.poeaa;

import ru.iteco.cources.poeaa.mvvm.Model;
import ru.iteco.cources.poeaa.mvvm.View;
import ru.iteco.cources.poeaa.mvvm.ViewModel;

public class Demo3 {
    public static void main(String[] args) {
        Model model = new Model();
        ViewModel viewModel = new ViewModel(model);
        View view = new View(viewModel);

        view.updateText("Artem");
        view.printText();
    }
}
