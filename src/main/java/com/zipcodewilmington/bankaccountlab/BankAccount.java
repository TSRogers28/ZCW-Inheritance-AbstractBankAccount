package com.zipcodewilmington.bankaccountlab;

/**
 * Created by leon on 1/10/18.
 */
public class BankAccount extends Account{
    Account businessAccount;
    Account savingsAccount;
    Account checkingAccount;
    Account [] accounts;

    public BankAccount(){
        businessAccount = new BusinessAccount(100000);
        savingsAccount = new SavingsAccount(80000);
        checkingAccount = new CheckingAccount(10000);
        accounts = new Account[]{businessAccount, savingsAccount, checkingAccount};
    }

    public BankAccount(int balance) {
        super(balance);
    }

    public Account getBusinessAccount() {
        return accounts[0];
    }



    public Account getSavingsAccount() {
        return accounts[1];
    }


    public Account getCheckingAccount() {
        return accounts[2];
    }
}
