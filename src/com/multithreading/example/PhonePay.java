package com.multithreading.example;

public class PhonePay extends Thread{
    private HDCFBank bankAccnt;

    public PhonePay(HDCFBank bankAccnt){
        this.bankAccnt = bankAccnt;
    }
    @Override
    public void run() {
        bankAccnt.deposit(5000);
    }
}
