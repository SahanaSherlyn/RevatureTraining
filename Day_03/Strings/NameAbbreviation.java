/*Write a program that takes your full name as input and displays the abbreviations of the first and middle names except the last name which is displayed as it is. 
For example, if your name is Robert Brett Roser, then the output should be R.B.Roser.*/

package com.revature.strings;

import java.util.Scanner;

public class NameAbbreviation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name:");
        String fullName = scan.nextLine();
        String[] nameParts = fullName.split(" ");
        StringBuilder abbreviatedName = new StringBuilder();
        for (int i = 0; i < nameParts.length - 1; i++)
            abbreviatedName.append(nameParts[i].charAt(0)).append(".");
        abbreviatedName.append(nameParts[nameParts.length - 1]);
        System.out.println("Abbreviated name: " + abbreviatedName.toString());
    }
}

