/*Input a string which contains some palindrome substrings. Find out the position of palindrome substrings if exist and replace it by *. 
(For example if input string is “bob has a radar plane then it should convert in “*** has a ***** plane)*/

package com.revature.strings;

import java.util.Scanner;

public class PalindromeSubstrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scan.nextLine();
        str= str.toLowerCase();
        StringBuilder output = new StringBuilder(str);
        for (int len = 3; len <= str.length(); len++) {
            for (int i = 0; i <= str.length() - len; i++) {
                String substr = str.substring(i, i + len);
                boolean isPalindrome = true;
                for (int j = 0; j < substr.length() / 2; j++) {
                    if (substr.charAt(j) != substr.charAt(substr.length() - 1 - j)) {
                        isPalindrome = false;
                        break;
                    }
                }
                if (isPalindrome) {
                    for (int j = 0; j < len; j++) 
                        output.setCharAt(i + j, '*');
                }
            }
        }

        System.out.println("Modified string: " + output.toString());
    }
}
