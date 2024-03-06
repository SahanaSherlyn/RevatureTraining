/*Write a program to calculate the sum of the digits of a 3-digit number.
Number : 132        Output : 6
Input the number using scanner.*/

import java.util.Scanner;

public class SumOfThreeDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 3-digit number:");
        int number = scanner.nextInt();
        if (number < 100 || number > 999) {
            System.out.println("Please enter a valid 3-digit number.");
        } else {
            int[] digits = new int[3];
            digits[0] = number / 100; 
            digits[1] = (number / 10) % 10; 
            digits[2] = number % 10; 
            int sum = 0;
            for (int digit : digits) {
                sum += digit;
            }
            System.out.println("The sum of the digits is: " + sum);
        }
    }
}

