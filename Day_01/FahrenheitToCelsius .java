/*Write a program to convert Fahrenheit into Celsius. Input the value using scanner.*/

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Fahrenheit:");
        float fahrenheit = scanner.nextFloat();
        float celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " degree Celsius.");
    }
}
