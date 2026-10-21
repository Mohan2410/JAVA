package com.interfaceprogram;

interface Animal{
    void makeSound();
}
class Dog implements Animal{
    @Override
    public void makeSound(){
        System.out.println("Dog barks");
    }
}
class Cat implements Animal{
    @Override
    public void makeSound(){
        System.out.println("cat barks");
    }
}
public class AnimalSoundSystem{
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.makeSound();
        c.makeSound();


        //Polymorphisms
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.makeSound();
        a2.makeSound();
    }
}