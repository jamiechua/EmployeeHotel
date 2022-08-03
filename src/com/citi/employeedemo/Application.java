package com.citi.employeedemo;

public class Application {

    public static void main(String[] args){
        Manager m1 = new Manager("Xiaoqing", 1, "IT");
        Subordinate s1 = new Subordinate("Jamie", 2, "IT", "Xiaoqing");

        Manager m2 = new Manager("Raihan", 3, "HR");
        Subordinate s2 = new Subordinate("Yin Wee", 4, "HR", "Raihan");

        Manager m3 = new Manager("Andy", 5, "Finance");
        Subordinate s3 = new Subordinate("Thomas", 6, "Finance", "Andy");
        Subordinate s4 = new Subordinate("Deepika", 7, "Finance", "Andy");

        System.out.println(m1);
        System.out.println(s1);
        System.out.println(m2);
        System.out.println(s2);
        System.out.println(m3);
        System.out.println(s3);
        System.out.println(s4);
    }
}
