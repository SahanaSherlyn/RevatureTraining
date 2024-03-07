/*Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.*/

package com.revature.methods;

import java.util.Scanner;

public class MaxMinNum {
    public static int findMax(int num1, int num2, int num3) {
        int max = num1; 
        if (num2 > max) 
            max = num2;
        if (num3 > max) 
            max = num3;
        return max;
    }
    public static int findMin(int num1, int num2, int num3) {
        int min = num1; 
        if (num2 < min) 
            min = num2;
        if (num3 < min) 
            min = num3;
        return min;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int max = findMax(num1, num2, num3);
        int min = findMin(num1, num2, num3);
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}
