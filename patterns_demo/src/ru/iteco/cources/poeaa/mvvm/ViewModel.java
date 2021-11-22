package ru.iteco.cources.poeaa.mvvm;

public class ViewModel {
    private Model model;

    public ViewModel(Model model) {
        this.model = model;
    }

    public String getTextFromModel() throws Exception {
        String text = model.getCurrentText();
        if(text.isEmpty())
            throw new Exception("Empty text!");

        return text;
    }

    public void setTextToModel(String newText) throws Exception {
        if(newText.isEmpty())
            throw new Exception("Empty text!");

        model.setCurrentText(newText);
    }
}
