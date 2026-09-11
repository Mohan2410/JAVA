package com.multithreading.example;

public class ATMThread extends Thread{
    private HDCFBank bankAccnt;

    ATMThread(HDCFBank bankAccnt){
        this.bankAccnt = bankAccnt;
    }
    @Override
    public void run() {
        System.out.println("ATM start");
        bankAccnt.withdraw(4000);

        System.out.println("1st---"+bankAccnt.accountBalance);
    }
}
