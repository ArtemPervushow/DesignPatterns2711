package ru.iteco.cources.structural.facade;

public class WindowPlan {
    private float widht;
    private float height;
    private String profileName;
    private String glassType;

    public WindowPlan(float widht, float height, String profileName, String glassType) {
        this.widht = widht;
        this.height = height;
        this.profileName = profileName;
        this.glassType = glassType;
    }

    @Override
    public String toString() {
        return "WindowPlan{" +
                "widht=" + widht +
                ", height=" + height +
                ", profileName='" + profileName + '\'' +
                ", glassType='" + glassType + '\'' +
                '}';
    }

    public float getWidht() {
        return widht;
    }

    public void setWidht(float widht) {
        this.widht = widht;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getGlassType() {
        return glassType;
    }

    public void setGlassType(String glassType) {
        this.glassType = glassType;
    }
}
