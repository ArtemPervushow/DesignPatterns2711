package ru.iteco.cources.poeaa.pagecontroller;

import java.util.HashMap;
import java.util.Map;

public class PageController {
    private Model model;
    private View currentView;
    private Map<String, View> viewMap = new HashMap<>();

    public PageController() {
        viewMap.put("Red", new View("Red"));
        viewMap.put("Pink", new View("Pink"));
        viewMap.put("Grey", new View("Grey"));
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void displayViewWithText(String text) {
        if(!model.getText().equals(text)) {
            model.setText(text);

            if(text.equals("Artem")) {
                currentView = viewMap.get("Red");
            } else if(text.equals("Kate")) {
                currentView = viewMap.get("Pink");
            } else {
                currentView = viewMap.get("Grey");
            }

            currentView.setData(text);
        } else {
            System.out.println("No need to change view");
        }

        currentView.display();
    }
}
