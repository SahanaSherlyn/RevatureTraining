/*BAnkAccount problem*/

package com.revature.partB;

import java.util.HashMap;
import java.util.Scanner;

class BankAccount {
    static int nextAccountNumber = 1000;
    static int totalTransactions = 0;
    String accountNumber;
    String name;
    String address;
    String type;
    double balance;
    int numberOfTransactions;

    public BankAccount(String name, String address, String type, double balance) {
        this.accountNumber = "BA" + nextAccountNumber++;
        this.name = name;
        this.address = address;
        this.type = type;
        this.balance = balance;
        this.numberOfTransactions = 0;
    }

    public void displayInformation() {
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Depositor Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Account Type: " + type);
        System.out.println("Balance: $" + balance);
        System.out.println("Number of Transactions: " + numberOfTransactions);
    }

    public void deposit(double amount) {
        balance += amount;
        numberOfTransactions++;
        totalTransactions++;
        displayInformation();
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }
        balance -= amount;
        numberOfTransactions++;
        totalTransactions++;
        displayInformation();
    }

    public void changeAddress(String newAddress) {
        address = newAddress;
        numberOfTransactions++;
        totalTransactions++;
        displayInformation();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, BankAccount> accounts = new HashMap<>();

        while (true) {
            System.out.println("\nBank Account Management System");
            System.out.println("1. Create account");
            System.out.println("2. Print User Information");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Change Address");
            System.out.println("6. Display Transactions");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            String accountNumber;
            BankAccount account;

            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Address: ");
                    String address = scanner.nextLine();
                    System.out.print("Account Type: ");
                    String type = scanner.nextLine();
                    System.out.print("Initial Balance: ");
                    double balance = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    account = new BankAccount(name, address, type, balance);
                    accounts.put(account.accountNumber, account);
                    System.out.println("Account created successfully. Account Number: " + account.accountNumber);
                    break;
                case 2:
                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.nextLine();
                    account = accounts.get(accountNumber);
                    if (account != null) {
                        account.displayInformation();
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.nextLine();
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account = accounts.get(accountNumber);
                    if (account != null) {
                        account.deposit(depositAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.nextLine();
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account = accounts.get(accountNumber);
                    if (account != null) {
                        account.withdraw(withdrawAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.nextLine();
                    System.out.print("Enter new address: ");
                    String newAddress = scanner.nextLine();
                    account = accounts.get(accountNumber);
                    if (account != null) {
                        account.changeAddress(newAddress);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 6:
                    System.out.println("Total number of transactions in this session: " + totalTransactions);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
                    break;
            }
        }
    }
}

