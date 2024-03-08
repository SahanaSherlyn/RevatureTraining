/*Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its length and breadth as parameters
of its constructor and having a method named 'returnArea' which returns the area of the rectangle. Length and breadth of rectangle are entered
through keyboard.*/

package com.revature.partA;

import java.util.Scanner;

public class RecArea {
    private double length;
    private double breadth;

    public RecArea(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double returnArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();
        RecArea rectangle = new RecArea(length, breadth);
        System.out.println("The area of the rectangle is: " + rectangle.returnArea());
    }
}

