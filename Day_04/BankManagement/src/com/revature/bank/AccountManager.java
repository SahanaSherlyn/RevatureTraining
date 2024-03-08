package com.revature.bank;

public class AccountManager {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA001", 1000.00, 5.0);
        CurrentAccount currentAccount = new CurrentAccount("CA001", 5000.00);
        DematAccount dematAccount = new DematAccount("DA001", 2000.00);

        savingsAccount.displayAccountDetails();
        savingsAccount.deposit(500);
        savingsAccount.addInterest();
        currentAccount.displayAccountDetails();
        currentAccount.withdraw(200);
        dematAccount.displayAccountDetails();
    }
}

