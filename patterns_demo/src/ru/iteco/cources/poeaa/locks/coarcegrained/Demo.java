package ru.iteco.cources.poeaa.locks.coarcegrained;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        CustomerSource customerSource = new CustomerSource();
        ClientSession clientSession = new ClientSession(customerSource,
                                             "Martin");
        ClientSession clientSession2 = new ClientSession(customerSource,
                                             "David");

        clientSession.work();
        clientSession2.work();
        while (true){

        }
    }
}
