package ru.iteco.cources.khmil.dz.dz1_2;

public interface ItemDao {
       void create(Item item);
    Item read(Integer id);
   void update(Item item);
   void delete(Item item);
}
