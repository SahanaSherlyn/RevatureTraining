/*Take 10 integer inputs from user and store them in an array. Again ask user to give a number. Now, tell user whether that number is present in array or not.*/

import java.util.*;

public class ElementInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements:");
        for (int i = 0; i < arr.length; i++) 
            arr[i] = sc.nextInt();
        System.out.println("Enter the element to be searched:");
        int element = sc.nextInt();
        boolean found = false; 
        for (int a : arr) {
            if (a == element) {
                found = true;
                break; 
            }
        }
        if (found) 
            System.out.println("Element is present in the array.");
        else 
            System.out.println("Element is not present in the array.");
    }
}
