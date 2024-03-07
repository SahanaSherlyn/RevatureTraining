/*Write a program to replace a given substring in a sentence with another string. For example, in the sentence, A batman with bat if we replace bat with snow, 
the new sentence should be printed as, A snowman with snow.*/

package com.revature.strings;

import java.util.Scanner;

public class ReplaceString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scan.nextLine();
        System.out.println("Enter the substring you want to replace:");
        String rSubstring = scan.nextLine();
        System.out.println("Enter the new substring:");
        String nSubstring = scan.nextLine();
        String newSentence = sentence.replace(rSubstring, nSubstring);
        System.out.println("New sentence: " + newSentence);
    }
}
