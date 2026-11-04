package com.multithreading.example;
class Counter implements Runnable{
    public void run(){
        for(int i=1;i<=1000;i++){
            increment();
        }
    }
    int count = 0;
    public void increment(){
        count = count + 1;
    }
}
public class ThreadExample7 {
    public static void main(String[] args) throws InterruptedException {
        Counter c1 = new Counter();
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c1);
        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
            return;
        }
        System.out.println("Final Count: "+c1.count);

    }
}
