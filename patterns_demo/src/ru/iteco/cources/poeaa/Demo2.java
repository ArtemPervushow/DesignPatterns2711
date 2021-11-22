package ru.iteco.cources.poeaa;

import ru.iteco.cources.poeaa.mvp.Model;
import ru.iteco.cources.poeaa.mvp.Presenter;
import ru.iteco.cources.poeaa.mvp.View;

public class Demo2 {
    public static void main(String[] args) {
        View view = new View();
        Presenter presenter = new Presenter(view);
        Model model = new Model(presenter);
        presenter.setModel(model);
        view.setPresenter(presenter);

        view.changeText("Artem");
    }
}
