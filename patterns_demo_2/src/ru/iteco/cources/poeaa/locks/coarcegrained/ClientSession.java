package ru.iteco.cources.poeaa.locks.coarcegrained;

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
                updateCustomer = customerSource.getCustomer(id);
                updateCustomer.setBalance(random.nextFloat());
                updateCustomer.getAddresses().get(0).setValue("Bryansk "+ random.nextInt());

                try {
                    customerSource.updateCustomer(updateCustomer);
                } catch (Exception exception) {
                    System.out.println("Customer already in user");
                    exception.printStackTrace();
                }

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
