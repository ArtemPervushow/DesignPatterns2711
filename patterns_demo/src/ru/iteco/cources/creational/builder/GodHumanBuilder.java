package ru.iteco.cources.creational.builder;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class GodHumanBuilder implements HumanBuilder{
    private String name;
    private short age;
    private short weight;
    private short height;
    private boolean sex;

    private List<String> errors = new LinkedList<>();

    @Override
    public HumanBuilder setName(String name) {
        if(name.length() <= 0) {
            name = "Anonimus";
        } else {
            this.name =  name;
        }
        return this;
    }

    @Override
    public HumanBuilder setAge(short age) {
        if(age <= 0) {
            errors.add("Wrong age less than 1!");
        } else if(age < 18) {
            errors.add("None adult age");
        } else {
            this.age = age;
        }
        return this;
    }

    @Override
    public HumanBuilder setWeight(short weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public HumanBuilder setHeight(short height) {
        this.height = height;
        return this;
    }

    @Override
    public HumanBuilder setSex(boolean sex) {
        try {
            this.sex = SexGiver.getSex();
        } catch (Exception exception) {
            errors.add(exception.getMessage());
        }
        return this;
    }

    @Override
    public Human build() throws Exception {
        if(errors.size() > 0) {
          throw new Exception(errors
                  .stream()
                  .collect(Collectors.joining(" , ")));
        } else {
            return new Human(name, age, weight, height, sex);
        }
    }
}
