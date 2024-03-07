/*Write a program to check if the letter 'e' is present in the word 'Umbrella'*/

package com.revature.strings;

public class CheckLetterE {
    public static void main(String[] args) {
        String word = "Umbrella";
        char letter = 'e';
        if (word.indexOf(letter) != -1) 
            System.out.println("The letter E is present in the word " + word);
        else 
            System.out.println("The letter E is not present in the word "+ word);
    }
}
