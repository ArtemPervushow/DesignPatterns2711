package ru.iteco.cources.khmil.dz.dz1;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FSItem {
    private List<FSItem> children = new ArrayList<>();
    private String name;

    public Directory(Directory parent, String name) {
        this.name = name;
        FS.INSTANCE.addDirectory(parent,this);
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
        StringBuilder sb = new StringBuilder();
        int index = FS.INSTANCE.getFs().indexOf(this);
        for (int i = 0; i <= index; i++) {
            sb.append(FS.INSTANCE.getFs().get(i).getName()).append("/");
        }
        return sb.toString();
    }

    @Override
    public FSItem getParent() {
        for (int i = FS.INSTANCE.getFs().size() - 1; i >= 0; i--) {
            if (FS.INSTANCE.getFs().get(i) instanceof Directory) {
                return FS.INSTANCE.getFs().get(i);
            }
        }
        return this;
    }

    public List<FSItem> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return "Directory{" +
                "children=" + children +
                ", name='" + name + '\'' +
                '}';
    }
}
