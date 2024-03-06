/*Take 10 integer inputs from user and store them in an array and print them on screen.*/

import java.util.*;

public class Arrays {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements:");
		for(int i = 0; i<arr.length; i++)
			arr[i] = sc.nextInt();
		for(int a : arr)
			System.out.println(a);
	}
}