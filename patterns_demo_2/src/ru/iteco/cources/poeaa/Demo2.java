package ru.iteco.cources.poeaa;

import ru.iteco.cources.poeaa.mvp.Model;
import ru.iteco.cources.poeaa.mvp.Presenter;
import ru.iteco.cources.poeaa.mvp.View;

public class Demo2 {
    public static void main(String[] args) {
        Model model = new Model();
        View view1 = new View();
        View view2 = new View();
        View view3 = new View();
        Presenter presenter = new Presenter();

        model.setPresenter(presenter);
        presenter.setModel(model);
        presenter.addView(view1);
        presenter.addView(view2);
        presenter.addView(view3);
        view1.setPresenter(presenter);
        view2.setPresenter(presenter);
        view3.setPresenter(presenter);

        view1.requestChangeText("Artem");
        view2.requestChangeText("Kate");
        view3.requestChangeText("Kate");
        view1.requestChangeText("Artem");
    }
}
