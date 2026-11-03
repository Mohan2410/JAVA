package com.multithreading.example;
class SleepMethodThread implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(500);
            }catch(InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}
class JoinMethodThread implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("Hello From Thread 2");
        System.out.println("Hello From Thread 2");
    }
}
public class ThreadExample4 {
    public static void main(String[] args) throws InterruptedException {
        SleepMethodThread smt = new SleepMethodThread();
        JoinMethodThread jmt = new JoinMethodThread();

        Thread t1 = new Thread(smt);
        Thread t2 = new Thread(jmt);

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
