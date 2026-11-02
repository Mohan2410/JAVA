package com.multithreading.example;

class MyThread11 extends Thread{
    @Override
    public void run(){
        System.out.println("run executed");
        System.out.println("thread is running");
        System.out.println("Thread Name: "+currentThread().getName());
        System.out.println("Thread Id: "+getId());
    }
}
public class Thread1 {
    public static void main(String[] args) {
        MyThread11 th = new MyThread11();
        th.start();


    }
}
