package com.corejava;

abstract class ATMCard {
    abstract public void withdraw(double amount);
}

abstract class ICICICard extends ATMCard{
    public void withdraw(double amount){
        System.out.println("withdraw() method is executed from ICICICard class ");
    }
}
class SBICard extends ATMCard{
    public void withdraw(double amount){
        System.out.println("withdraw() method is executed from SBICard class");
    }
}
class HDFCCard extends ATMCard{
    public void withdraw(double amount){
        System.out.println("withdraw() method is executed from HDFCCard class");
    }
}
class RuntimePoly{
    public static void main(String args[]){

            ATMCard card = new SBICard();
            card.withdraw(70000);
    }
}