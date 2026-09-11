package com.multithreading.example;

public class GooglePay extends Thread{
    private HDCFBank bankAccnt;

    public GooglePay(HDCFBank bankAccnt){
        this.bankAccnt = bankAccnt;
    }

    @Override
    public void run() {
        System.out.println("Google pay start");
        bankAccnt.withdraw(2000);

        System.out.println("2nd------"+bankAccnt.accountBalance);
    }
}
