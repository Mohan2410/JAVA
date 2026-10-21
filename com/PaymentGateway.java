package com.interfaceprogram;

interface PaymentMethod{
    void pay(double amount);
    void generateReceipt();
}

interface Cashback{
    double getCashback(double amount);
}

class CreditCard implements PaymentMethod{
    @Override
    public void pay(double amount){
        System.out.println("Paid ₹"+amount+"  using Credit Card");
    }

    @Override
    public void generateReceipt(){
        System.out.println("Receipt: UPI payment of ₹X");
    }
}
class UPI implements PaymentMethod, Cashback{
    @Override
    public void pay(double amount){
        System.out.println("Paid ₹"+amount+"  using UPI");
    }

    @Override
    public void generateReceipt(){
        System.out.println("Reciept: UPI payment of  ₹X");
    }

    @Override
    public double getCashback(double amount){
        return amount*0.02;
    }
}
class PayPal implements PaymentMethod, Cashback{
    @Override
    public void pay(double amount){
        System.out.println("Paid ₹"+amount+"  using PayPal");
    }

    @Override
    public void generateReceipt(){
        System.out.println("Receipt: PayPal payment of ₹X");
    }

    @Override
    public double getCashback(double amount){

        return amount*0.05;
    }

}

public class PaymentGateway{
    public static void main(String[] args){
        PaymentMethod[] p1 = new PaymentMethod[3];

        p1[0] = new UPI();
        p1[1] = new CreditCard();
        p1[2] = new PayPal();

        for(int i=0;i<p1.length;i++){
            p1[i].pay(500);
            p1[i].generateReceipt();
        }
    }
}






















