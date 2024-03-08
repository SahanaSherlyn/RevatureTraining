package com.revature.bank;

public class CurrentAccount extends Account {
    public CurrentAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }
    @Override
    public void displayAccountDetails() {
        System.out.println("Current Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}



