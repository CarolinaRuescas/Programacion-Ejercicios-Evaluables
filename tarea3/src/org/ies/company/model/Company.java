package org.ies.company.model;

import java.util.Arrays;
import java.util.Objects;

public class Company {
    private String name;
    private String cif;
    private Department[] departments;

    public Company(String name, String cif, Department[] departments) {
        this.name = name;
        this.cif = cif;
        this.departments = departments;
    }

    public void showInfo(){
        System.out.println("Nombre de la empresa: " + name + " | CIF: " + cif + " | Departamentos: " );
        for (var department : departments){
            department.showInfo();
        }
    }


    public Department findDepartment(String name){
        for (var department : departments){
            if(department.getName().equals(name)){
                return department;
            }
        }
        return null;
    }

    // Dado el nombre de departamento, mostrar sus datos. Si no existe
    // mostrar no se encuentra el departamento
    public void showDepartment (String name){
        var department = findDepartment(name);
        if (department == null){
            System.out.println("Departamento no encontrado");
        }else{
            department.showInfo();
        }
    }

    // mostrar los empleados de un departamento dando el nombre del departamento. Si no existe mostrar
    // no se encuentra el departamento

    public void showEmployeesDepartment ( String name){
        for (var department : departments){
            if (department.getName().equals(name)){
                for (var employee : department.getEmployees()){
                    System.out.println(employee);
                }
            }
        }
        System.out.println("No se encuentra el departamento");
    }


    // Dado un nombre de departamento y un nif mostrar los datos del empleado del departamento
    //Si no existe el departamento mostrar no existe. Si no existe el empleado en el departamento mostrar
    // no se encuentra el empleado en el departamento

    public Employee findEmployeeInDepartment (String nameDepartment, String nifEmployee){
        var department = findDepartment(nameDepartment);
        if (department != null){
            var employee = department.findEmployee(nifEmployee);
            if (employee != null){
                return employee;
            }

        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name) && Objects.equals(cif, company.cif) && Objects.deepEquals(departments, company.departments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cif, Arrays.hashCode(departments));
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", cif='" + cif + '\'' +
                ", departments=" + Arrays.toString(departments) +
                '}';
    }
}