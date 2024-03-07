/*Write down the names of 10 of your friends in an array and then sort those in alphabetically ascending order.(HINT : USE the compareTo method of String)*/

package com.revature.strings;

import java.util.Scanner;

public class SortNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] names = new String[10];
        System.out.println("Enter the names of 10 friends:");
        for (int i = 0; i < names.length; i++) 
            names[i] = scan.nextLine();
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.println("\nFriends' names in alphabetical order:");
        for (String name : names) 
            System.out.println(name);
    }
}
