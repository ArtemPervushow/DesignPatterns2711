package ru.iteco.cources.poeaa.locks;

public class Demo {
    public static void main(String[] args) {
        CustomerSource customerSource = new CustomerSource();
        customerSource.updateCustomer(new Customer(1l, "Artem", 1000.0f));
        customerSource.updateCustomer(new Customer(2l, "Kate", 100.0f));
        customerSource.updateCustomer(new Customer(3l, "Egor", 10.0f));

        ClientSession clientSession1 = new ClientSession("Martin", customerSource);
        ClientSession clientSession2 = new ClientSession("David", customerSource);

        clientSession1.work();
        clientSession2.work();

        while (true){

        }
    }
}
