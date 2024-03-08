/* Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named
'Employee'. The output should be as follows:
Name        Year of joining        Address
Robert            1994                64C- WallsStreet
Sam                2000                68D- WallsStreet
John                1999                26B- WallsStreet*/

package com.revature.partA;

public class Employee {
    String name;
    int YOJ;
    int salary;
    String address;

    public Employee(String name, int YOJ, int salary, String address) {
        this.name = name;
        this.YOJ = YOJ;
        this.salary=salary;
        this.address = address;
    }

    public static void printEmployeeDetails(Employee[] employees) {
        System.out.printf("%-15s %-20s %-15s%n", "Name", "Year of joining", "Address");
        for (Employee employee : employees) {
            System.out.printf("%-15s %-20d %-15s%n", employee.name, employee.YOJ, employee.address);
        }
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Robert", 1994, 45000, "64C- WallsStreet");
        Employee employee2 = new Employee("Sam", 2000, 50000, "68D- WallsStreet");
        Employee employee3 = new Employee("John", 1999, 55000, "26B- WallsStreet");
        System.out.println(employee1.name + " " + employee1.YOJ + " " + employee1.address);
        System.out.println(employee2.name + " " + employee2.YOJ + " " + employee2.address);
        System.out.println(employee3.name + " " + employee3.YOJ + " " + employee3.address);
    }
}

