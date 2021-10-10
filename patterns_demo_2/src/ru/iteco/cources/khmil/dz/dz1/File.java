package ru.iteco.cources.khmil.dz.dz1;

public class File implements FSItem {
    private String name;
    private final Directory parent;

    public File(Directory parent, String name) {
        FS.INSTANCE.addFile(parent, this);
        this.name = name;
        this.parent = parent;
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
        return parent.getPath()+"/"+name;
    }

    @Override
    public FSItem getParent() {
        return parent;
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                '}';
    }
}
