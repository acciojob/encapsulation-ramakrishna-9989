package com.driver;

public class Main {
    public static void main(String[] args) {
        // Task 3
        RWOnly obj = new RWOnly();

        // Task 4
        // obj.name = "John"; // Error: 'name' has private access in RWOnly
        // System.out.println(obj.name); // Error: 'name' has private access in RWOnly

        // Task 6
        obj.setName("John");
        System.out.println(obj.getName()); // Should print "John"
    }
}