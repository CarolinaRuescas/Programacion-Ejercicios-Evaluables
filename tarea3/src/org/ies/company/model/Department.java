package org.ies.company.model;

import java.util.Arrays;
import java.util.Objects;

public class Department {
    private String name;
    private int budget;
    private Employee[] employees;

    public Department(String name, int budget, Employee[] employees) {
        this.name = name;
        this.budget = budget;
        this.employees = employees;
    }

    public void showInfo(){
        System.out.println("Nombre del departamento: " + name + ". | Presupuesto: " + budget + ". | Empleados: " );
        for (var employee : employees){
            employee.showInfo();
        }
    }

    public Employee findEmployee (String nif){
        for (var employee : employees){
            if (employee.getNif().equals(nif)){
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

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return budget == that.budget && Objects.equals(name, that.name) && Objects.deepEquals(employees, that.employees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, budget, Arrays.hashCode(employees));
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", budget=" + budget +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }
}


