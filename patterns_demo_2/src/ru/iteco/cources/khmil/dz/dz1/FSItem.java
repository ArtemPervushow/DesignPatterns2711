package ru.iteco.cources.khmil.dz.dz1;

public interface FSItem {
    String getName();
    void setName(String name);
    String getPath();
    FSItem getParent();
}
