package ru.iteco.cources.khmil.dz.dz1;

import java.util.ArrayList;
import java.util.List;

public enum FS {
    INSTANCE;
    private final List<FSItem> fs = new ArrayList<>();

    public List<FSItem> getFs() {
        return fs;
    }

    public void addDirectory(Directory parentDirectory, Directory directory) {
        if (parentDirectory == null) {
            INSTANCE.fs.add(directory);
        } else {
            for (FSItem item : parentDirectory.getChildren()) {
                int count = 0;
                if (item.getName().equals(directory.getName())) {
                    count++;
                    directory.setName(directory.getName() + count);
                }
            }
            parentDirectory.getChildren().add(directory);
            INSTANCE.fs.set(INSTANCE.fs.indexOf(parentDirectory) + 1, directory);
        }
    }
    public void addFile(Directory parentDirectory, File file){
        if(parentDirectory==null){
            INSTANCE.fs.add(file);

        }else {
            parentDirectory.getChildren().add(file);
        }
    }

    @Override
    public String toString() {
        return "FS{" +
                "fs=" + fs +
                '}';
    }
}
