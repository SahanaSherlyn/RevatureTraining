/*Take 20 integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0s.*/

import java.util.*;

public class NumCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the input:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int positiveNums = 0;
        int negativeNums = 0;
        int oddNums = 0;
        int evenNums = 0;
        int zeros = 0;
        System.out.println("Enter the integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > 0) 
                positiveNums++;
            else if (arr[i] < 0) 
                negativeNums++;
            else 
                zeros++;
            if (arr[i] % 2 == 0) 
                evenNums++;
            else 
                oddNums++;
        }
        System.out.println("Number of positive numbers: " + positiveNums);
        System.out.println("Number of negative numbers: " + negativeNums);
        System.out.println("Number of odd numbers: " + oddNums);
        System.out.println("Number of even numbers: " + evenNums);
        System.out.println("Number of 0's: " + zeros);
    }
}
