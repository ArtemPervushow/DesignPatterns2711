package ru.iteco.cources.poeaa.mvp;

import java.util.ArrayList;
import java.util.List;

public class Presenter {
    private List<View> views;
    private Model model;

    public Presenter() {
        views = new ArrayList<>();
    }

    public void addView(View view) {
        views.add(view);
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void populateData(String data) {
        if(!data.isEmpty()) {
            for (View view:
                 views) {
                view.showText(data);
            }
        }
    }

    public void processData(String newText) {
        if(!newText.isEmpty())
            model.setData(newText);
    }
}
