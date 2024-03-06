/*Take values of length and breadth of a rectangle from user and check if it is square or not.*/

import java.util.Scanner;

public class SquareOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        float length = scan.nextFloat(); 
        System.out.println("Enter the breadth of the rectangle: ");
        float breadth = scan.nextFloat(); 
        if(length == breadth) {
            System.out.println("It is a square.");
        } else {
            System.out.println("It is not a square.");
        }
    }
}
