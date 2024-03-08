/*Write a program to print the name, salary and date of joining of 10 employees in a company.
Use array of objects.*/

package com.revature.partB;

public class Employee {
    String name;
    double salary;
    String dateOfJoining;

    public Employee(String name, double salary, String dateOfJoining) {
        this.name = name;
        this.salary = salary;
        this.dateOfJoining = dateOfJoining;
    }

    public void printDetails() {
        System.out.println("Name: " + name + ", Salary: " + salary + ", Date of Joining: " + dateOfJoining);
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Sahana", 50000, "15-Mar-2024");
        employees[1] = new Employee("Neelam", 60000, "1-Apr-2024");
        employees[2] = new Employee("Issac", 65000, "1-May-2024");
        employees[3] = new Employee("Teju", 60000, "1-Jun-2024");
        employees[4] = new Employee("Varsha", 60000, "1-Jul-2024");
        employees[5] = new Employee("Isaac", 60000, "1-Aug-2024");
        employees[6] = new Employee("Sana", 60000, "1-Sep-2024");
        employees[7] = new Employee("John", 60000, "1-Oct-2024");
        employees[8] = new Employee("Karthik", 60000, "1-Nov-2024");
        employees[9] = new Employee("Athreya", 60000, "1-Dec-2024");

        for (Employee employee : employees) {
            if (employee != null) {
                employee.printDetails();
            }
        }
    }
}


