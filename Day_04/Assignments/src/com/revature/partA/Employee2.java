/*Write a program by creating an 'Employee' class having the following methods and print the final salary.
1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.*/

package com.revature.partA;

public class Employee2 {
    private double salary;
    private int workHoursPerDay;

    public void getInfo(double salary, int workHoursPerDay) {
        this.salary = salary;
        this.workHoursPerDay = workHoursPerDay;
    }

    public void addSal() {
        if (salary < 500) {
            salary += 10;
        }
    }

    public void addWork() {
        if (workHoursPerDay > 6) {
            salary += 5;
        }
    }

    public void printSalary() {
        System.out.println("The final salary is: $" + salary);
    }

    public static void main(String[] args) {
        Employee2 employee = new Employee2();
        employee.getInfo(600, 9);
        employee.addSal();
        employee.addWork();
        employee.printSalary();
    }
}

