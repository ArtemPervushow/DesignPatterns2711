package ru.iteco.cources.poeaa.locks.implicit;

import java.util.Random;

public class ClientSession {
    private String userName;
    private Random random;
    private CustomerSource customerSource;

    public ClientSession(String userName, CustomerSource customerSource) {
        this.userName = userName;
        this.random = new Random();
        this.customerSource = customerSource;
    }

    public void work() {
        Thread thread = new Thread(() -> {
            while (true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }

                long id = random.nextInt(3) + 1;
                Customer updateCustomer = null;
                try {
                    updateCustomer = customerSource.getCustomer(id);
                } catch (Exception exception) {
                    System.out.println("Customer already in use!");
                    continue;
                }
                updateCustomer.setBalance(random.nextFloat());

                customerSource.updateCustomer(updateCustomer);

                System.out.println("Updated with " + userName + " id:" + updateCustomer.getId());

                System.out.println(updateCustomer);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }

                System.out.println("Printed with " + userName + " id:" + updateCustomer.getId());
                customerSource.printCustomers();
            }
        });
        thread.start();
    }
}
