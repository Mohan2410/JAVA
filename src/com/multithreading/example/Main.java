package com.multithreading.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        HDCFBank Mohan = new HDCFBank(7000);
        ATMThread atm = new ATMThread(Mohan);
        atm.setName("ATM Thread");

        GooglePay gp = new GooglePay(Mohan);
        gp.setName("GooglePay Thread");

        PhonePay phonePay = new PhonePay(Mohan);
        phonePay.setName("PhonePay Thread");

        atm.start();
        gp.start();
        phonePay.start();
    }
}
