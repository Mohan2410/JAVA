package com.multithreading.example;

class MyThread2 extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for(int i = 0; i<=10;i++){
            System.out.println(i);
        }
    }
}
public class Sample{
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2();
        System.out.println(Thread.currentThread().getName());

        t1.start();

        MyThread2 t2 = new MyThread2();
        t2.start();
    }
}