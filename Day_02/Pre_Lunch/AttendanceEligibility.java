/*3. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.
allow student to sit if he/she has medical cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.*/

import java.util.Scanner;

public class AttendanceEligibility {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of classes held:");
        int classesHeld = scan.nextInt();
        System.out.println("Enter the number of classes attended:");
        int classesAttended = scan.nextInt();
        System.out.println("Do you have a medical cause? (Y/N):");
        char medicalCause = scan.next().charAt(0);
        double attendancePercent = ((double)classesAttended / classesHeld) * 100;
        System.out.println("Percentage of classes attended: " + attendancePercent + "%");
        if(attendancePercent < 75) {
            if(medicalCause == 'Y' || medicalCause == 'y') {
                System.out.println("You are allowed to sit in the exam due to a medical cause.");
            } else {
                System.out.println("You are not allowed to sit in the exam due to low attendance.");
            }
        } else {
            System.out.println("You are allowed to sit in the exam.");
        }
    }
}
