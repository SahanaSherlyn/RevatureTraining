/*Using recursion, define a method to know nth term of a Fibonacci series.
Nth term of Fibonacci series is
F(n) = F(n-1)+(n-2)
F(0) = 0
F(1) = 1
F(2) = F(1)+(0) = 1+0 = 1
F(3) = F(2)+(1) = 1+1 = 2
F(4) = F(3)+(2) = 2+1 = 3*/

package com.revature.methods;

import java.util.Scanner;

public class FibonacciSeries {
    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scan.nextInt();
        System.out.println("The " + n + "th term of the Fibonacci series is: " + fibonacci(n));
    }
}
