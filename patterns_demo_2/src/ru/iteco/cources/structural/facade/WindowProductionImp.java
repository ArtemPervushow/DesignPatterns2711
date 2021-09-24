package ru.iteco.cources.structural.facade;

public class WindowProductionImp implements WindowProduction {
    private RamaConstructor ramaConstructor = new RamaConstructor();
    private FurnitureConstructor furnitureConstructor = new FurnitureConstructor();
    private GlassConstructor glassConstructor = new GlassConstructor();

    @Override
    public boolean createWindow(WindowPlan plan) {
        boolean result = ramaConstructor.createRama(plan);
        if(result) {
            result = furnitureConstructor.createFurniture(plan);
            if(result) {
                glassConstructor.createGlass(plan);
            }
        }
        return result;
    }
}
