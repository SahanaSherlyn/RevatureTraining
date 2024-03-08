/*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' with
constructor having the three sides as its parameters.*/

package com.revature.partA;

public class Triangle {
    int a, b, c;
    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getPerimeter() {
        return a + b + c;
    }

    public double getArea() {
        int s = getPerimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        Triangle tri = new Triangle(3, 4, 5);
        System.out.println("Area of the triangle: " + tri.getArea());
        System.out.println("Perimeter of the triangle: " + tri.getPerimeter());
    }
}

