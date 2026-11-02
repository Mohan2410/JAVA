package com.multithreading.example;
class NumberPrinter implements Runnable{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for (int i = 1;i<=5;i++){
            System.out.println(i);
        }

    }
}
class AlphabetPrinter implements Runnable{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for(char ch = 'A'; ch<='E';ch++){
            System.out.println(ch);
        }
    }
}

public class ThreadExample3 {
    public static void main(String[] args) {
        NumberPrinter obj = new NumberPrinter();
        AlphabetPrinter ap = new AlphabetPrinter();
        Thread th1 = new Thread(obj);
        Thread th2 = new Thread(ap);
        th1.start();
        th2.start();
    }
}
