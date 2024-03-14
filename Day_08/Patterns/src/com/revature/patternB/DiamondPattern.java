package com.revature.patternB;

import java.util.Scanner;

public class DiamondPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows (odd number):");
        int rows = scanner.nextInt();
        if (rows % 2 == 0) {
            System.out.println("Number of rows must be an odd number.");
            return;
        }
        int midRow = rows / 2 + 1;
        for (int i = 1; i <= midRow; i++) {
            for (int j = 1; j <= midRow - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = midRow - 1; i >= 1; i--) {
            for (int j = 1; j <= midRow - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
