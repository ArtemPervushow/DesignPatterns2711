package ru.iteco.cources.structural.proxy;

import ru.iteco.cources.structural.proxy.base.Cash;
import ru.iteco.cources.structural.proxy.base.CreditCardAsProxy;
import ru.iteco.cources.structural.proxy.base.Payment;
import ru.iteco.cources.structural.proxy.logproxy.Reporter;
import ru.iteco.cources.structural.proxy.logproxy.ReporterIml;
import ru.iteco.cources.structural.proxy.logproxy.ReporterProxyCounted;
import ru.iteco.cources.structural.proxy.logproxy.ReporterProxyLogged;

public class Demo {
    public static void main(String[] args) throws Exception {
        Cash cash = new Cash(1000f);
        Payment proxiedCash = new CreditCardAsProxy(cash);

        cash.makePayment(100f);
        proxiedCash.makePayment(50f);

        //----------------------------
        Reporter reporter1 = new ReporterIml();
        Reporter reporter2 = new ReporterProxyLogged(reporter1);
        Reporter reporter3 = new ReporterProxyCounted(reporter1);
        Reporter reporter4 = new ReporterProxyCounted(reporter2);

        System.out.println("1");
        reporter1.makeReport(10);
        System.out.println("2");
        reporter2.makeReport(10);
        System.out.println("3");
        reporter3.makeReport(10);
        System.out.println("4");
        reporter4.makeReport(10);
    }
}
