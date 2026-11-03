package com.multithreading.example;

class ThreadPrinting implements Runnable{
    public void run(){
        System.out.println("Thread is running");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread execution completed");
    }
}
public class ThreadExample6{
    public static void main(String[] args) throws InterruptedException {

        ThreadPrinting tp = new ThreadPrinting();
        Thread t1 = new Thread(tp);
        System.out.println("Before start: "+t1.getState());

        t1.start();
        System.out.println("After Completion: "+t1.getState());
        t1.join();


    }
}
