/*Write a program to print the roll number and average marks of 8 students in three subjects (each out of 100). The marks are entered by user.*/

package com.revature.partB;

import java.util.Scanner;

class StudentMarks {
    int rollNumber;
    float averageMarks;

    public StudentMarks(int rollNumber, float marks1, float marks2, float marks3) {
        this.rollNumber = rollNumber;
        this.averageMarks = (marks1 + marks2 + marks3) / 3;
    }

    public void printDetails() {
        System.out.println("Roll Number: " + rollNumber + ", Average Marks: " + averageMarks);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentMarks[] stu = new StudentMarks[8];
        for (int i = 0; i < stu.length; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll Number: ");
            int rollNumber = scanner.nextInt();
            System.out.print("Marks in Subject 1: ");
            float marks1 = scanner.nextFloat();
            System.out.print("Marks in Subject 2: ");
            float marks2 = scanner.nextFloat();
            System.out.print("Marks in Subject 3: ");
            float marks3 = scanner.nextFloat();
            stu[i] = new StudentMarks(rollNumber, marks1, marks2, marks3);
        }

        System.out.println("Student Details (Roll Number, Average Marks):");
        for (StudentMarks student : stu) {
            student.printDetails();
        }
    }
}

