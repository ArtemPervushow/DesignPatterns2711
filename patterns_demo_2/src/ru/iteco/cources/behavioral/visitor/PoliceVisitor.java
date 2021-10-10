package ru.iteco.cources.behavioral.visitor;

public class PoliceVisitor implements OrganizationVisitor {
    @Override
    public void visit(Organization organization) {
        System.out.println(organization.getDirectorName());

        for (String emp:
             organization.getEmployees()) {
            System.out.println(emp);
        }

        if(organization instanceof WeaponWarehouse) {
            WeaponWarehouse warehouse = (WeaponWarehouse) organization;
            for (String weapon:
                 warehouse.getWeaponList()) {
                System.out.println(weapon);
            }
        }
    }
}
