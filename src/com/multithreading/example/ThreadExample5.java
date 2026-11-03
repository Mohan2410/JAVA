package com.multithreading.example;
class Thread1PrintingNumbers implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }
    }
}
class Thread2PrintingAlphabet implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for(char ch = 'A';ch<='E';ch++){
            System.out.println(ch);
        }
    }
}
class Thread3PrintingMsg5Times implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for(int i = 1;i <=5;i++){
            System.out.println("Java Multithreading");
        }
    }
}
public class ThreadExample5 {
    public static void main(String[] args) {
        Thread1PrintingNumbers obj1 = new Thread1PrintingNumbers();
        Thread2PrintingAlphabet obj2 = new Thread2PrintingAlphabet();
        Thread3PrintingMsg5Times obj3 = new Thread3PrintingMsg5Times();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        Thread t3 = new Thread(obj3);

       t1.setPriority(5);
        t2.setPriority(5);
        t3.setPriority(10);

        t1.start();
        t2.start();
        t3.start();
//        t2.setPriority(0);



    }
}
