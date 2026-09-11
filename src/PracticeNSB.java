package com.corejava;

class Example21 {
    //NSB

    {
        System.out.println("NSB1");
    }
    Example21(){
        System.out.println("No arguments constructor");
    }

    //NSB
    {
        System.out.println("NSB2");
    }

}
class PractiveNSB{
    public static void main(String[] args){
        System.out.println("main");

        Example21 e2 = new Example21();
    }
}