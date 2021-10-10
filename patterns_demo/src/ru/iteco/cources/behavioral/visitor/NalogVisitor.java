package ru.iteco.cources.behavioral.visitor;

public class NalogVisitor implements OrganizationVisitor {
    @Override
    public void inspectOrganization(Organization organization) {
        System.out.println(organization.getBalance());
        System.out.println(organization.getDirector());
    }
}
