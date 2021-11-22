package ru.iteco.cources.poeaa.locks.coarcegrained.optimistic;

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

                Customer updateCustomer =
                        new Customer(random.nextInt(3)+1,
                                     userName,
                                     random.nextFloat());

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

    public void workInClient() {
        Thread thread = new Thread(() -> {
            while (true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }

                long id = random.nextInt(3) + 1;

                Customer updateCustomer = customerSource.getCustomer(id);
                updateCustomer.setBalance(random.nextFloat());
                updateCustomer.setVersion(customerSource.getVersionSequence());

                customerSource.updateCustomer(updateCustomer);

                System.out.println("Updated with " + userName + " id:" + updateCustomer.getId());

                System.out.println(updateCustomer);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }

                Customer actualCustomer = customerSource.getCustomer(id);
                if(actualCustomer.getVersion() > updateCustomer.getVersion()){
                    System.out.println("Wrong version");
                    //TODO transaction rollback
                    return;
                }
                System.out.println("Printed with " + userName + " id:" + updateCustomer.getId());
                customerSource.printCustomers();
            }
        });
        thread.start();
    }
}
