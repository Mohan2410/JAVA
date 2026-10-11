package com.collection;

public class Temp {
    public String toString(){
        return "temp";
    }

    @Override
    protected void finalize() throws Throwable {
//        super.finalize();
        System.out.println("Finalize method is called");
    }

}
