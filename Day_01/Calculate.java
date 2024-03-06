/*Write a program to add 8 to the number 2345 and then divide it by 3. Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result.*/

public class Calculate {
    public static void main(String[] args) {
        int number = 2345;
        number += 8;
        double quotient = number / 3.0;
        double remainder = quotient % 5;
        double result = remainder * 5;
        System.out.println("The final result is: " + result);
    }
}
