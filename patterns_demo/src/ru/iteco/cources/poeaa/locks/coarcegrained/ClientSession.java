package ru.iteco.cources.poeaa.locks.coarcegrained;

import java.util.Random;

public class ClientSession {
    private CustomerSource customerSource;
    private String sessionName;
    private Random random = new Random();

    public ClientSession(CustomerSource customerSource, String sessionName) {
        this.customerSource = customerSource;
        this.sessionName = sessionName;
    }

    public void work() {
        Thread thread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(random.nextInt(5000));
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
                System.out.println("Working " + sessionName);
                Customer customer = new Customer(random.nextInt(4) - 1,
                        sessionName + "User",
                        random.nextFloat());

                customer
                        .getAddresses()
                        .add(new Address(random.nextLong(),
                                random.nextDouble() + ""));

                customerSource
                        .updateCustomer(customer);
                customerSource.printCustomers();
            }
        });
        thread.start();
    }
}
