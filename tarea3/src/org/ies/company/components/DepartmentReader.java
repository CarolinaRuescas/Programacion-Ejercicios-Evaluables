package org.ies.company.components;

import org.ies.company.model.Department;
import org.ies.company.model.Employee;

import java.util.Scanner;

public class DepartmentReader {
    private final Scanner scanner;
    private final EmployeeReader employeeReader;

    public DepartmentReader(Scanner scanner, EmployeeReader employeeReader) {
        this.scanner = scanner;
        this.employeeReader = employeeReader;
    }

    public Department read(){
        System.out.println("INTRODUCE LOS DATOS DEL DEPARTAMENTO");
        System.out.println("Introduce el nombre del departamento: ");
        String name = scanner.nextLine();

        System.out.println("Introduce el presupuesto que tiene: ");
        int budget = scanner.nextInt();

        int numEmployees = readNumEmployees();

        Employee[] employees = new Employee[numEmployees];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = employeeReader.read();

        }

        return new Department(
                name,
                budget,
                employees
        );
    }

    // Para que no puedan introducir un numero negativo de empleados
    private int readNumEmployees(){
        int numEmployees;
        do{
            System.out.println("¿Cuántos empleados hay?");
            numEmployees = scanner.nextInt();
            scanner.nextLine();
        }while (numEmployees < 0);
        return numEmployees;
    }
}