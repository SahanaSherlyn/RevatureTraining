/*Print the multiplication table of 15 using recursion.*/

package com.revature.methods;

public class MulTable {
    public static void printTable(int num, int mul) {
        if (mul <= 10) { 
            System.out.println(num + " * " + mul + " = " + (num * mul));
            printTable(num, mul + 1); 
        }
    }
    public static void main(String[] args) {
        int number = 15; 
        int startingMultiplier = 1; 
        System.out.println("Multiplication table of " + number + ":");
        printTable(number, startingMultiplier); 
    }
}
