package ru.iteco.cources.structural.composite;

public class Demo {
    public static void main(String[] args) {
        Corps corps = new Corps(2);
        Division division1 = new Division(10);
        Division division2 = new Division(15);
        Regiment regiment1 = new Regiment(1000);
        Regiment regiment2 = new Regiment(900);
        Regiment regiment3 = new Regiment(1200);
        Regiment regiment4 = new Regiment(1100);

        division1.addRegiment(regiment1);
        division1.addRegiment(regiment2);
        division2.addRegiment(regiment3);
        division2.addRegiment(regiment4);

        corps.addDivision(division1);
        corps.addDivision(division2);

        System.out.println(corps.countSoldiers());
    }
}
