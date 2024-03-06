/*Take 10 integer inputs from user and store them in an array. Now, copy all the elements in an another array but in reverse order.*/

import java.util.Scanner;

public class ReverseArrayCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 10; 
        int[] originalArray = new int[size];
        int[] reversedArray = new int[size];
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < size; i++) 
            originalArray[i] = sc.nextInt();
        for (int i = 0; i < size; i++) 
            reversedArray[size - 1 - i] = originalArray[i];
        System.out.println("Original Array:");
        for (int i = 0; i < size; i++) 
            System.out.print(originalArray[i] + " ");
        System.out.println();
        System.out.println("Reversed Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(reversedArray[i] + " ");
        }
    }
}
