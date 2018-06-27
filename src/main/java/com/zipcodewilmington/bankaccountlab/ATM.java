package com.zipcodewilmington.bankaccountlab;

/**
 * Created by leon on 1/10/18.
 */
public class ATM {

    BankAccount bankAccount;

    public ATM(){
        bankAccount = new BankAccount();
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public int getSavings(){
    return bankAccount.getSavingsAccount().getBalance();
    }

    public void setSavings(int amountWithdrawn){
        bankAccount.getSavingsAccount().setBalance(getSavings()-amountWithdrawn);
    }

    public int getBusiness(){
        return bankAccount.getBusinessAccount().getBalance();
    }

    public void setBusiness(int amountWithdrawn){
        bankAccount.getBusinessAccount().setBalance(getBusiness()-amountWithdrawn);
    }

    public int getChecking(){
        return bankAccount.getCheckingAccount().getBalance();
    }

    public void setChecking(int amountWithdrawn){
        bankAccount.getCheckingAccount().setBalance(getChecking()-amountWithdrawn);
    }

}
