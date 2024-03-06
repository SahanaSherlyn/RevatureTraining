/*Suppose the values of variables 'a' and 'b' are 6 and 8 respecrtively, write two programs to swap the values of the two variables.
A - first program by using a third variable
B - second program without using any third variable*/

public class SwappingWithoutUsingThirdVariable {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        a = a + b; 
        b = a - b; 
        a = a - b; 
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
