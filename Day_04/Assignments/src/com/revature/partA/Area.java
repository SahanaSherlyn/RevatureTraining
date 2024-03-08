/*Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. First method named as 'setDim' takes
length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle. Length and breadth of
rectangle are entered through keyboard.*/

package com.revature.partA;

import java.util.Scanner;

public class Area {
    private double length;
    private double breadth;

    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Area rectangle = new Area();

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        rectangle.setDim(length, breadth);

        System.out.println("The area of the rectangle is: " + rectangle.getArea());
    }
}

