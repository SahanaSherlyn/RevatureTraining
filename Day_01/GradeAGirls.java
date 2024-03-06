/*The total number of students in a class are 90 out of which 45 are boys. If 50% of the total students secured grade 'A' out of which 20 are boys, then write a program to calculate the total number of girls getting grade 'A'.*/

public class GradeAGirls {
    public static void main(String[] args) {
        int totalStudents = 90;
        int totalBoys = 45;
        int totalGirls = totalStudents - totalBoys; 
        int studentsWithGradeA = totalStudents / 2;
        int boysWithGradeA = 20;
        int girlsWithGradeA = studentsWithGradeA - boysWithGradeA;
        System.out.println("Total number of girls getting grade 'A': " + girlsWithGradeA);
    }
}
