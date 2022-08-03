package com.citi.employeedemo;

public class Manager extends Employees{

    private double bonus=1000.0;
    public Manager(String name, int ID, String department){
        super(name, ID, department);
    }

    public double calculateSalary(){
        return baseSalary + bonus;
    }

    public String toString(){
        return super.toString() +"Salary: " + calculateSalary();
    }
}
