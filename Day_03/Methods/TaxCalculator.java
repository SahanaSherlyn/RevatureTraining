/*Write a program that takes as input your gross salary and your total saving and uses another function named taxCalculator() to calculate your tax. 
The taxCalculator() function takes as parameters the gross salary as well as the total savings amount. The tax is calculated as follows:
(a) The savings is deducted from the gross income to calculate the taxable income. Maximum deduction of savings can be Rs. 100,000, even though the amount can 
be more than this.
(b) For up to 100,000 as taxable income the tax is 0 (Slab 0); beyond 100,000 to 200,000 tax is 10% of the difference above 100,000 (Slab 1); beyond 200,000 up to 
500,000 the net tax is the tax calculated from Slab 0 and Slab 1 and then 20% of the taxable income exceeding 200,000 (Slab 2); if its more than 500,000, then the 
tax is tax from Slab 0, Slab 1, Slab 2 and 30% of the amount exceeding 500,000.*/

package com.revature.methods;

import java.util.Scanner;

public class TaxCalculator {
    public static double taxCal(double grossSalary, double totalSavings) {
        double maxSavingsDeduction = 100000;
        double taxableIncome = grossSalary - Math.min(totalSavings, maxSavingsDeduction);
        double tax = 0;
        if (taxableIncome > 500000) {
            tax += (taxableIncome - 500000) * 0.30 + 60000; 
            taxableIncome = 500000;
        }
        if (taxableIncome > 200000) {
            tax += (taxableIncome - 200000) * 0.20;
            taxableIncome = 200000;
	}
        if (taxableIncome > 100000)
            tax += (taxableIncome - 100000) * 0.10;
        return tax;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your gross salary: ");
        double grossSalary = scan.nextDouble();
        System.out.println("Enter your total savings: ");
        double totalSavings = scan.nextDouble();
        double tax = taxCal(grossSalary, totalSavings);
        System.out.println("Your calculated tax is: Rs. " + tax);
    }
}
