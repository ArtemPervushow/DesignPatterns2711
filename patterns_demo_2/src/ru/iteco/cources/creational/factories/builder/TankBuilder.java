package ru.iteco.cources.creational.factories.builder;

import ru.iteco.cources.creational.factories.model.Tank;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class TankBuilder {
    private String model;
    private short weight;
    private int capacityMove;
    private float calibr;

    private List<String> errorList = new LinkedList<>();

    public TankBuilder setModel(String model) {
        if(model.isEmpty()) {
            this.model = "Default";
        } else {
            this.model = model;
        }

        return this;
    }

    public TankBuilder setWeight(short weight) {
        if(weight <= 0) {
            errorList.add("Incorrect weiht! Less than zero");
        } else {
            this.weight = weight;
        }

        return this;
    }

    public TankBuilder setCapacityMove(int capacityMove) {
        this.capacityMove = capacityMove;

        return this;
    }

    public TankBuilder setCalibr(float calibr) {
        this.calibr = calibr;

        return this;
    }

    public Tank build() throws Exception {
        if(errorList.size() == 0) {
            Tank tank = new Tank();
            tank.setCalibr(this.calibr);
            tank.setCapacityMove(this.capacityMove);
            tank.setModel(this.model);
            tank.setWeight(this.weight);

            return tank;
        } else {
            throw new Exception(errorList
                                    .stream()
                                    .collect(Collectors.joining(" ")));
        }
    }
}
