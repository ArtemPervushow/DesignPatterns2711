package ru.iteco.cources.structural.facade;

class FurnitureConstructor {
    public boolean createFurniture(WindowPlan plan) {
        if(plan.getProfileName().isEmpty()) {
            return false;
        } else {
            System.out.println("Create furniture for profile " + plan.getProfileName());
            return true;
        }
    }
}
