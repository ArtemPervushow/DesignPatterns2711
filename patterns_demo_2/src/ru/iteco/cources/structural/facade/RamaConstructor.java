package ru.iteco.cources.structural.facade;

class RamaConstructor {
    public boolean createRama(WindowPlan plan) {
        if(plan.getWidht() > 0 && plan.getHeight() > 0) {
            System.out.println("Created rama sized " + plan.getHeight() + ":" +plan.getWidht());
            return true;
        } else {
            return false;
        }
    }
}
