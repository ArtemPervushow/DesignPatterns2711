package ru.iteco.cources.creational.builder;

public interface HumanBuilder {
    HumanBuilder setName(String name);

    HumanBuilder setAge(short age);

    HumanBuilder setWeight(short weight);

    HumanBuilder setHeight(short height);

    HumanBuilder setSex(boolean sex);

    Human build() throws Exception;
}
