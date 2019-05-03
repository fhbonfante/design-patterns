package com.felipehb.designpatterns.structural.composite;

public class DepartmentProcessor {
    public static void main(String[] args) {
        Department financialDepartment = new FinancialDepartment();
        Department salesDepartment = new SalesDepartment();
        Department headDepartment = new HeadDepartment(financialDepartment,salesDepartment);

        System.out.println(financialDepartment.getDepartmentResponsability());
        System.out.println(salesDepartment.getDepartmentResponsability());
        System.out.println(headDepartment.getDepartmentResponsability());
    }
}
