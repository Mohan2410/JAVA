package com.multithreading.example;

import com.sun.nio.file.ExtendedWatchEventModifier;

class Alpha implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread Name: "+Thread.currentThread());

        for(int i=2;i<=10;i = i + 2){
            System.out.println(i+" ");
            try{
                Thread.sleep(2000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}
class Beta implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread Name: "+Thread.currentThread());
        for (int i = 1;i<=10; i = i + 2){
            System.out.println(i+" ");

            try{
                Thread.sleep(2000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        System.out.println();


    }
}
public class MultiThreadingUsingRunnable {
    public static void main(String[] args) {
        try{
            Alpha a1 = new Alpha();
            Beta b1 = new Beta();

            Thread t1 = new Thread(a1,"acbt1");
            Thread t2 = new Thread(b1,"xyzt2");

            t1.start();
            t1.join();

            t2.start();
            t2.join();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
