package com.revature.pattern;

import java.util.Scanner;

public class HollowSquareColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of stars:");
        int stars = scanner.nextInt();
        System.out.println("Enter the number of times to repeat the square:");
        int numColumns = scanner.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int column = 0; column < numColumns; column++) {
                for (int j = 0; j < stars; j++) {
                    if (i == 0 || i == (rows - 1) || j == 0 || j == (stars - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                if (column < numColumns - 1) {
                    System.out.print("");
                }
            }
            System.out.println();
        }
    }
}
