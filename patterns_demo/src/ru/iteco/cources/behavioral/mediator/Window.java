package ru.iteco.cources.behavioral.mediator;

public class Window implements ProductionWndMediator{
    private Rama rama = new Rama(this);
    private Furniture furniture = new Furniture();
    private Glass glass = new Glass();


    @Override
    public void setWidht(float widht) {
        rama.setWidht(widht);
        glass.setWidht(widht - 10);
    }

    @Override
    public void setHeight(float height) {
        rama.setHeight(height);
        glass.setWidht(height - 10);
    }

    @Override
    public void setGlassSize(double size) {
        glass.setSize(size);
        if(furniture.isWormSave() && glass.getSize() > 25) {
            System.out.println("Attention! No need so fat size and worm safe!");
        }
    }

    @Override
    public void setCountFurniture(int countFurniture) {
        furniture.setCount(countFurniture);
        rama.setCountOfFurniture(countFurniture);
    }

    @Override
    public void setRamaName(String name) {
        rama.setName(name);
    }

    @Override
    public void setFurnName(String name) {
        furniture.setName(name);
    }

    @Override
    public void setGlassName(String name) {
        furniture.setName(name);
    }

    @Override
    public void setWornSafe(boolean safe) {
        furniture.setWormSave(safe);
        if(safe && glass.getSize() > 25) {
            glass.setSize(25);
        }
    }
}
