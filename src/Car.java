package com.corejava;

class Car{
    String model;
    String Company;
    double price;
    int speed;

    void accelerate(){
        speed = speed + 10;
    }

    void brake(){
        speed = speed - 10;
    }

    void showData(){
        System.out.println("Model is: "+model);
        System.out.println("Company is: "+Company);
        System.out.println("Price is: "+price);
        System.out.println("Speed is: "+speed);
    }
}
