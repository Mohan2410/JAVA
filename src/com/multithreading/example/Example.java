package com.multithreading.example;


class EvenThread extends Thread{
    public EvenThread(String threadName){
        super(threadName);
    }

    @Override
    public void run(){
        System.out.println("Thread Name: "+Thread.currentThread().getName());
        for (int i = 2;i <= 10; i = i + 2){
            System.out.println(i+" ");
            try{
                Thread.sleep(500);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}
class OddThread extends Thread{

    public OddThread(String threadName){
        super(threadName);
    }
    @Override
    public void run(){
        System.out.println("Thread Name: "+Thread.currentThread().getName());
        for (int i = 1;i<=10;i = i + 2){
            System.out.println(i+" ");
            try{
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }

        }
        System.out.println();
    }
}
public class Example {
    public static void main(String[] args) {
        try{
            EvenThread e1 = new EvenThread("Even Thread");
            e1.start();
            e1.join();

            OddThread o1 = new OddThread("Odd Thread");
            o1.start();
            o1.join();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
