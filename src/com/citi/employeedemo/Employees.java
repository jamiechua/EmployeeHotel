package com.citi.employeedemo;
import java.util.*;
public class Employees {
    private String name;
    private int ID;
    private String department;
    protected double baseSalary = 7000.0;
    private static int count=0;

    public Employees(String name, int ID, String department){
        count++;
        this.name = name;
        this.ID = ID;
        this.department = department;
    }
    @Override
    public String toString() {
        return String.format("Employee's name: %s | Employee's ID: %d | Department: %s ", name, ID, department);
    }
}
