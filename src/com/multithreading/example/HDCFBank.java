package com.multithreading.example;

public class HDCFBank {
    int accountBalance;

    public HDCFBank(int accountBalance){
        this.accountBalance = accountBalance;
    }

    public synchronized void withdraw(int withdrawalAmount){
        accountBalance = this.accountBalance - withdrawalAmount;
    }

    public synchronized void deposit(int amtToBeDeposited){
        accountBalance = this.accountBalance + amtToBeDeposited;
    }

}
