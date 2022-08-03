package com.citi.employeedemo;
import java.util.HashMap;
public class Application {

    public static void main(String[] args){

        HashMap<String, String> departmentCodes = new HashMap<>();
        departmentCodes.put("IT","Information Technology");
        departmentCodes.put("HR","Human Resource");
        departmentCodes.put("FI","Finance");

        Manager m1 = new Manager("Xiaoqing", 1, "IT");
        Subordinate s1 = new Subordinate("Jamie", 2, "IT", "Xiaoqing");

        Manager m2 = new Manager("Raihan", 3, "HR");
        Subordinate s2 = new Subordinate("Yin Wee", 4, "HR", "Raihan");

        Manager m3 = new Manager("Andy", 5, "FI");
        Subordinate s3 = new Subordinate("Thomas", 6, "FI", "Andy");
        Subordinate s4 = new Subordinate("Deepika", 7, "FI", "Andy");

        System.out.println("------------------Departments in Employee Hotel------------------");
        for (var entry : departmentCodes.keySet()) {
            System.out.println("Department name: " + departmentCodes.get(entry) + " | Department code: " + entry);
        }

        System.out.println("/n------------------Employees in Employee Hotel------------------");

        System.out.println(m1);
        System.out.println(s1);
        System.out.println(m2);
        System.out.println(s2);
        System.out.println(m3);
        System.out.println(s3);
        System.out.println(s4);



    }
}
