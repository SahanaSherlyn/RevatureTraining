/*Take 10 integers from keyboard using loop and print their average value on the screen.*/

import java.util.Scanner;

public class AvgOfIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;
        System.out.println("Enter 10 integers:");
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt(); 
            sum += numbers[i]; 
        }
        double average = (double) sum / numbers.length; 
        System.out.println("The average value is: " + average);
    }
}
