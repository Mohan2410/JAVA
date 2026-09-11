package com.corejava;

class carDemo{
    public static void main(String[] args){
        Car c1 = new Car();
        Car c2 = new Car();

        c1.model = "CRETA";
        c1.Company = "Hyundai";
        c1.price = 500000.00;
        c1.speed = 160;

        c2.model = "Maruti Suzuki";
        c2.Company = "TATA";
        c2.price = 1000000.00;
        c2.speed = 140;

        c1.accelerate();
        c1.brake();


        c2.accelerate();
        c2.brake();

        System.out.println("Display detail of car 1: ");
        c1.showData();

        System.out.println();

        System.out.println("Display details of car 2: ");
        c2.showData();



    }
}