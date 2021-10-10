package ru.iteco.cources.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class CommerceOrganization extends Organization {
    private List<String> clients = new ArrayList<>();

    public CommerceOrganization(List<String> employees, String director, float balance, float licenseNum) {
        super(employees, director, balance, licenseNum);
    }

    public List<String> getClients() {
        return clients;
    }

    public void setClients(List<String> clients) {
        this.clients = clients;
    }
}
