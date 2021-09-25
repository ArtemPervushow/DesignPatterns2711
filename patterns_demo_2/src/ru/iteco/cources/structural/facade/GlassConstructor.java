package ru.iteco.cources.structural.facade;

class GlassConstructor {
    public void createGlass(WindowPlan plan) {
        if(plan.getGlassType().isEmpty()) {
            return;
        } else {
            System.out.println("Glass " + plan.getGlassType() + " added");
        }
    }
}
