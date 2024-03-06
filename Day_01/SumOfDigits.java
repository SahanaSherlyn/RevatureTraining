/*Write a program to calculate the sum of the first and the second last digit of a 5 digit.
E.g.- NUMBER : 12345        OUTPUT : 1+4=5 
Input the number using scanner.*/

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 5-digit number:");
        int number = scanner.nextInt();
        if (number < 10000 || number > 99999) {
            System.out.println("Please enter a valid 5-digit number.");
        } else {
            int firstDigit = number / 10000;
            int secondLastDigit = (number / 10) % 10;
            int sum = firstDigit + secondLastDigit;
            System.out.println("Sum of the first and second-last digits: " + sum);
        } 
    }
}
