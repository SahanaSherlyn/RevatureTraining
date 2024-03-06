/*Take integer inputs from user until he/she presses q ( Ask to press q to quit after every integer input ). Print average and product of all numbers.*/

import java.util.Scanner;

public class CalculateAvgAndPrd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        long product = 1;
        int count = 0;
        System.out.println("Enter integers (press 'q' to quit):");
        while (true) {
            System.out.print("Enter an integer or 'q' to quit: ");
            String input = scan.next();
            if(input.equalsIgnoreCase("q")) {
                break; 
            } else {
                int number = Integer.parseInt(input); 
                sum += number; 
                product *= number; 
                count++; 
            }
        }
        if(count > 0) {
            double average = (double) sum / count; 
            System.out.println("Average of the entered numbers: " + average);
            System.out.println("Product of the entered numbers: " + product);
        } else {
            System.out.println("No numbers were entered.");
        }
    }
}
