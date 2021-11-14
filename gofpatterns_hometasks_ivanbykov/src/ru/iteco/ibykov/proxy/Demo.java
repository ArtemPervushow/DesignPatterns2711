package ru.iteco.ibykov.proxy;

import ru.iteco.ibykov.proxy.base.Cash;
import ru.iteco.ibykov.proxy.base.CreditCardAsProxy;
import ru.iteco.ibykov.proxy.base.PaymentAgent;
import ru.iteco.ibykov.proxy.homework.User;
import ru.iteco.ibykov.proxy.homework.UsersOver18Impl;
import ru.iteco.ibykov.proxy.logged.CounterReporterProxy;
import ru.iteco.ibykov.proxy.logged.LoggedReporterProxy;
import ru.iteco.ibykov.proxy.logged.Reporter;
import ru.iteco.ibykov.proxy.logged.ReporterIml;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) throws Exception {
        PaymentAgent agent1 = new Cash(1000f);
        PaymentAgent agent2 = new CreditCardAsProxy((Cash) agent1);

        System.out.println(agent1.makePayment(100));
        System.out.println(agent2.makePayment(100));

        Reporter reporter1 = new ReporterIml();
        Reporter reporter2 = new LoggedReporterProxy(reporter1);
        Reporter reporter3 = new CounterReporterProxy(reporter1);
        Reporter reporter4 = new CounterReporterProxy(reporter2);

        System.out.println("1");
        System.out.println(reporter1.makeReport(10));
        System.out.println("2");
        System.out.println(reporter2.makeReport(10));
        System.out.println("3");
        System.out.println(reporter3.makeReport(10));
        System.out.println("4");
        System.out.println(reporter4.makeReport(10));

        UsersOver18Impl oldusers = new UsersOver18Impl();
        ArrayList<User> input = new ArrayList<>();
        input.add(new User("Chapaev",50,"admin"));
        input.add(new User("Petr",16,"ordinarec"));

        oldusers.changeUsers(input);
        System.out.println(oldusers.getAll().toString());//one admin one young, so output will be empty list
    }
}
