package org.ies.company.components;

import java.util.Scanner;

public class CompanyApp {
    private final Scanner scanner;
    private final CompanyReader companyReader;

    public CompanyApp(Scanner scanner, CompanyReader companyReader) {
        this.scanner = scanner;
        this.companyReader = companyReader;
    }

    public void run(){
        var company = companyReader.read();

        int option;
        do{
            option = chooseOption();
            if(option == 1){
                System.out.println("Introduce el nombre de un departamento");
                String name = scanner.nextLine();
                company.showDepartment(name);


            }else if (option == 2){
                System.out.println("Introduce el nombre de un departamento");
                String name = scanner.nextLine();
                company.showEmployeesDepartment(name);


            }else if (option == 3){
                System.out.println("Introduce un nombre de departamento: ");
                String name = scanner.nextLine();

                System.out.println("Introduce el nif del empleado: ");
                String nif = scanner.nextLine();

                var employee = company.findEmployeeInDepartment(name,nif);
                var department = company.findDepartment(name);

                if (employee ==null){
                    System.out.println("No se encuentra el empleado en el departamento");
                }else{
                    employee.showInfo();
                }
                if (department== null){
                    System.out.println("No existe el departamento");
                    department.showInfo();
                }
            }else if (option == 4 ){
                System.out.println("Saliendo....");
            }

        }while (option != 4);

    }

    private int chooseOption(){
        int option;
        System.out.println("ELIJA UNA OPCIÓN");
        System.out.println("1. Dado nombre del departamento mostrar sus datos");
        System.out.println("2. Dado nombre del departamento mostrar sus empleados");
        System.out.println("3. Dado nombre de departamento y un nif mostrar datos del empleado de ese departamento");
        System.out.println("4. Salir");
        option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }
}