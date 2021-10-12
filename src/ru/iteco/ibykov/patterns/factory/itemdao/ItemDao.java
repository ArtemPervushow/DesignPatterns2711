package ru.iteco.ibykov.patterns.factory.itemdao;

import ru.iteco.ibykov.patterns.factory.Id;

public interface ItemDao {
    Object create(Item item);
    Item read(Id id);
    void update(Item item);
    void delete(Item item);

}
