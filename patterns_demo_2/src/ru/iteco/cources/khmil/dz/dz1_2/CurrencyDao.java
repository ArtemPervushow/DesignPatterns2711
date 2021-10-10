package ru.iteco.cources.khmil.dz.dz1_2;

public interface CurrencyDao {
    void create(Currency currency);
    Currency read(Integer id);
    void update(Currency currency);
    void delete(Currency currency);
}
