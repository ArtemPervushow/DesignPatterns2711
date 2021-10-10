package ru.iteco.cources.khmil.dz.dz1;

public class Demo {
    public static void main(String[] args) {
        new File(null,"firstFile");
        Directory firstDir = new Directory(null,"firstDir");
        new File(firstDir,"secondFileInFirstDir");
        System.out.println(FS.INSTANCE.getFs());
    }
}
