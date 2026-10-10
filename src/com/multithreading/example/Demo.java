package com.multithreading.example;

class EvenThread1 extends Thread{
    public EvenThread1(String threadName){
        super(threadName);
    }
    @Override
    public void run(){
        System.out.println("Thread Name: "+Thread.currentThread().getName());
        for(int i = 2;i<=10;i+=2){
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
class OddThread1 extends Thread{
    public OddThread1(String threadName){
        super(threadName);
    }

    @Override
    public void run() {
        System.out.println("thread Name: "+Thread.currentThread().getName());
        for (int i=1;i<=10;i+=2){
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
public class Demo {
    public static void main(String[] args){
        try{
            EvenThread1 e1 = new EvenThread1("Even Thread");
            e1.start();
            e1.join();

            OddThread1 o1 = new OddThread1("Odd Thread");
            o1.start();
//            e1.join();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
