package org.ies.company.components;

import org.ies.company.model.Employee;

import java.util.Scanner;

public class EmployeeReader {
    private final Scanner scanner;

    public EmployeeReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Employee read(){
        System.out.println("INTRODUCE LOS DATOS DEL EMPLEDAO");
        System.out.println("Introduce el NIF: ");
        String nif = scanner.nextLine();
        System.out.println("Introduce el nombre: ");
        String name = scanner.nextLine();
        System.out.println("Introduce el apellido: ");
        String surname = scanner.nextLine();
        System.out.println("Introduce el departamento: ");
        String department = scanner.nextLine();

        return new Employee(
                nif,
                name,
                surname,
                department
        );
    }
}