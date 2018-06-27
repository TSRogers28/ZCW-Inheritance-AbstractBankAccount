package com.zipcodewilmington.bankaccountlab;

public abstract class Account {

    int balance;

    public Account(){

    }

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}
