package org.ies.company.components;

import org.ies.company.model.Company;
import org.ies.company.model.Department;

import java.util.Scanner;

public class CompanyReader {
    private final Scanner scanner;
    private final DepartmentReader departmentReader;

    public CompanyReader(Scanner scanner, DepartmentReader departmentReader) {
        this.scanner = scanner;
        this.departmentReader = departmentReader;
    }

    public Company read(){
        System.out.println("INTRODUCE LOS DATOS DE LA EMPRESA");
        System.out.println("Introduce el nombre: ");
        String name = scanner.nextLine();

        System.out.println("Introduce el CIF: ");
        String cif = scanner.nextLine();

        int numDepartments = readNumDepartments();
        Department[] departments = new Department[numDepartments];
        for (int i = 0; i < departments.length; i++) {
            departments[i] = departmentReader.read();
        }

        return new Company(
                name,
                cif,
                departments
        );
    }

    // para que no se pueda introducir un numero negativo de departamentos
    private int readNumDepartments(){
        int numDepartments;
        do{
            System.out.println("¿Cuántos departamentos hay? ");
            numDepartments = scanner.nextInt();
            scanner.nextLine();
        }while( numDepartments < 0);
        return numDepartments;
    }

}