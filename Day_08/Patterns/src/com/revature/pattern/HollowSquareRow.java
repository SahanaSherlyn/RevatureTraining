package com.revature.pattern;

import java.util.Scanner;

public class HollowSquareRow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int rows = scanner.nextInt();
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j <= rows; j++) {
                for (int k = 1; k <= rows; k++) {
                    if (j == 1 || j == rows || k == 1 || k == rows) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
               if (i > 1) {
                    System.out.print("");
                }
                System.out.println();
            }
            if (i > 1) {
                System.out.println();
            }
        }
    }
}
