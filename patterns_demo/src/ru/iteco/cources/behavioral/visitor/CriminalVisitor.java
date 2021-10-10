package ru.iteco.cources.behavioral.visitor;

public class CriminalVisitor implements OrganizationVisitor {
    @Override
    public void inspectOrganization(Organization organization) {
        for (String emp:
             organization.getEmployees()) {
            System.out.println(emp);
        }
        System.out.println(organization.getDirector());

        if(organization instanceof CommerceOrganization) {
            for (String client:
                    ((CommerceOrganization)organization).getClients()) {
                System.out.println(client);
            }
        }
    }
}
