/*Write a program to find greatest common divisor (GCD) or highest common factor (HCF) of given two numbers*/

import java.util.Scanner;

public class GCDorHCF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number:");
        int num2 = scan.nextInt();
        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        System.out.println("The GCD or HCF of the given numbers is: " + num1);
    }
}
