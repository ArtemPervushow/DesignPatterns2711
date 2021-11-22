package ru.iteco.cources.poeaa.mvvm;

import java.util.ArrayList;
import java.util.List;

public class ViewModel {
    private Model model;
    private List<View> views = new ArrayList<>();

    public void addView(View view) {
        views.add(view);
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public String requestData() {
       String data = model.getData();

       if(!data.isEmpty()) {
           return data;
       } else {
           return "No data now";
       }
    }

    public void changeData(String newData) {
        if(!newData.isEmpty()) {
            model.setData(newData);

            for (View view:
                 views) {
                view.requestPage();
            }
        }
    }
}
