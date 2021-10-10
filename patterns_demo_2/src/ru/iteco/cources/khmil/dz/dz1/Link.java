package ru.iteco.cources.khmil.dz.dz1;

public class Link implements FSItem {
    private String name;
    private FSItem link;

    public Link(String name, FSItem link) {
        this.name = name;
        this.link = link;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getPath() {
        return null;
    }

    @Override
    public FSItem getParent() {
        return null;
    }
}
