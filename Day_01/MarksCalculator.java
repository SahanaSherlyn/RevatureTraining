/*Input the marks of Robert in three subjects using Scanner (each out of 100 ), write a program to calculate his total marks and percentage marks.*/

import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks of Robert in all three subjects:");
        System.out.print("Subject 1: ");
        double marks1 = scanner.nextDouble();
        System.out.print("Subject 2: ");
        double marks2 = scanner.nextDouble();
        System.out.print("Subject 3: ");
        double marks3 = scanner.nextDouble();
        double totalMarks = marks1 + marks2 + marks3;
        double percentage = (totalMarks / 300.0) * 100;
        System.out.println("Total marks: " + totalMarks);
        System.out.printf("Percentage marks: %.2f%%\n", percentage);
        scanner.close();
    }
}
