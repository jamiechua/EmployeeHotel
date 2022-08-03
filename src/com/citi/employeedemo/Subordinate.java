package com.citi.employeedemo;

public class Subordinate extends Employees {

    private String managerName;
    public Subordinate(String name, int ID, String department, String managerName){
        super(name, ID, department);
        this.managerName = managerName;
    }
    public double calculateSalary(){
        return baseSalary;
    }
    public String toString(){
        return super.toString() + "Salary: " + calculateSalary() + " | Manager: " + managerName;
    }
}
