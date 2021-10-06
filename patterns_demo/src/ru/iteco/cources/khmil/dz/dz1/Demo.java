package ru.iteco.cources.khmil.dz.dz1;

public class Demo {
    public static void main(String[] args) {
        new File(null,"firstFile");
        Directory firstdir = new Directory(null, "FIRSTDIR");
        new File(firstdir,"secondFile");
        System.out.println(FS.INSTANCE.getFs());
    }
}
