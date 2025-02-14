package org.ies.company;

import org.ies.company.components.CompanyApp;
import org.ies.company.components.CompanyReader;
import org.ies.company.components.DepartmentReader;
import org.ies.company.components.EmployeeReader;

import java.util.Scanner;

public class CompanyAppMain {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var employeeReader = new EmployeeReader(scanner);
        var departmentReader = new DepartmentReader(scanner,employeeReader);
        var companyReader = new CompanyReader(scanner, departmentReader);
        var companyApp = new CompanyApp(scanner,companyReader);

        companyApp.run();

    }
}