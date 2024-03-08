package com.revature.bank;

public abstract class Account {
    protected String accountNumber;
    protected double balance;
    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New balance is " + balance);
    }
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Remaining balance is " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
    public abstract void displayAccountDetails();
}

