/*Write a program to find the number of vowels, consonents, digits and white space characters in a string*/

package com.revature.strings;

import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scan.nextLine();
        int vowels = 0, consonants = 0, digits = 0, whitespaces = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
                vowels++;
            else if (Character.isDigit(ch)) 
                digits++;
            else if (Character.isWhitespace(ch)) 
                whitespaces++;
            else if ((ch >= 'a' && ch <= 'z')) 
                consonants++;
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Whitespaces: " + whitespaces);
    }
}

