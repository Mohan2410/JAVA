package com.interfaceprogram;

interface Printable{
    void print();
}

interface Showable{
    void show();
}

class Document implements Printable, Showable{
    @Override
    public void print(){
        System.out.println("printing....");
    }

    @Override
    public void show(){
        System.out.println("showing....");
    }
}
public class DocumentInterface{
    public static void main(String[] args){
        Printable p1 = new Document();
        Showable p2 = new Document();

        p1.print();
        p2.show();
    }
}