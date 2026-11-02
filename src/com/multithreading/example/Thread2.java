package com.multithreading.example;


class ImplementingRunnableInterface implements Runnable{
    @Override
    public void run(){
        System.out.println("implement the runnable interface");
        System.out.println("Thread Name: "+Thread.currentThread().getName());
        System.out.println("Thread Id: "+Thread.currentThread().threadId());

    }
}
public class Thread2{
    public static void main(String[] args){
        ImplementingRunnableInterface obj = new ImplementingRunnableInterface();
        Thread th = new Thread(obj);

        th.start();
    }
}
