package ru.iteco.cources.poeaa;

import ru.iteco.cources.poeaa.mvvm.Model;
import ru.iteco.cources.poeaa.mvvm.View;
import ru.iteco.cources.poeaa.mvvm.ViewModel;

public class Demo3 {
    public static void main(String[] args) {
        Model model = new Model();

        ViewModel viewModel = new ViewModel();
        viewModel.setModel(model);

        View view1 = new View();
        view1.setViewModel(viewModel);
        viewModel.addView(view1);

        View view2 = new View();
        view2.setViewModel(viewModel);
        viewModel.addView(view2);

        View view3 = new View();
        view3.setViewModel(viewModel);
        viewModel.addView(view3);

        view1.requestChangeData("Artem");
        view2.requestPage();
        view3.requestChangeData("Denis");
    }
}
