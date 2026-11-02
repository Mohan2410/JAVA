package com.multithreading.example;

class Even_Thread implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for(int i=2;i<=10;i = i + 2){
            System.out.println("Even number: "+i);
        }
    }
}
class Odd_Thread implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for (int i = 1;i<=9;i = i + 2){
            System.out.println("Odd number: "+i);
        }
    }
}
public class EvenOdd {
    public static void main(String[] args) throws InterruptedException {
        Even_Thread e1 = new Even_Thread();
        Odd_Thread o1 = new Odd_Thread();
        Thread t1 = new Thread(e1);
        Thread t2 = new Thread(o1);
        t1.start();
        t1.join();

        t2.start();
        t2.join();
    }
}
