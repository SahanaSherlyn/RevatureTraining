package com.revature.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
    private int id;
    private String name;
    private double salary;
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Sahana", 700000));
        employees.add(new Employee(2, "Neelam", 800000));
        employees.add(new Employee(3, "Issac", 900000));
        employees.add(new Employee(4, "Sana", 300000));

        System.out.println("Employees with salary > 400000:");
        employees.stream().filter(e -> e.getSalary() > 400000).forEach(System.out::println);

        System.out.println("\nAfter 25% salary hike:");
        employees.stream().filter(e -> e.getSalary() > 400000).peek(e -> e.setSalary(e.getSalary() * 1.25)).forEach(System.out::println);

        List<String> empNames = employees.stream().map(e -> e.getName().toUpperCase()).collect(Collectors.toList());

        System.out.println("\nEmployee Names in Uppercase:");
        empNames.forEach(System.out::println);
    }
}

