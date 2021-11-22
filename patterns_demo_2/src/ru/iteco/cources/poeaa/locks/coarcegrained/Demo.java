package ru.iteco.cources.poeaa.locks.coarcegrained;

public class Demo {
    public static void main(String[] args) throws Exception {
        CustomerSource customerSource = new CustomerSource();
        Customer customer1 = new Customer(1l, "Artem", 1000.0f);
        customer1.getAddresses().add(new Address(1l, "Some"));
        customerSource.updateCustomer(customer1);
        Customer customer2 = new Customer(2l, "Kate", 100.0f);
        customer2.getAddresses().add(new Address(2l, "Some2"));
        customerSource.updateCustomer(customer2);
        Customer customer3 = new Customer(3l, "Egor", 10.0f);
        customer3.getAddresses().add(new Address(3l, "Some3"));
        customerSource.updateCustomer(customer3);

        ClientSession clientSession1 = new ClientSession("Martin", customerSource);
        ClientSession clientSession2 = new ClientSession("David", customerSource);

        clientSession1.work();
        clientSession2.work();

        while (true){

        }
    }
}
