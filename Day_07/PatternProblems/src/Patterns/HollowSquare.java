package Patterns;

import java.util.Scanner;

public class HollowSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int size = scanner.nextInt();
        for (int i = 1; i <= size; i++) {
            if (i == 1 || i == size) {
                for (int j = 1; j <= size; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 1; j <= size; j++) {
                    if (j == 1 || j == size) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}

