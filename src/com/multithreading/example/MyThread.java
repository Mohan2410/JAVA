package com.multithreading.example;


class MyThread1 extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for (int i = 0;i<=10;i++){

            System.out.println(".");
        }
    }
}
public class MyThread{
    public static void main(String[] args) {
        MyThread1 s1 = new MyThread1();
        s1.start();

        System.out.println(Thread.currentThread().getName());
        for(int i = 0;i <= 10;i++){
            System.out.println("#");
        }
    }
}