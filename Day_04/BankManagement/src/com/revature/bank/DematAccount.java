package com.revature.bank;

public class DematAccount extends Account {
    public DematAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }
    @Override
    public void displayAccountDetails() {
        System.out.println("Demat Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
