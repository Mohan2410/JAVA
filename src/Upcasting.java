class Vehicle{
    void start(){
        System.out.println("Vehicle started");
    }
}

class Car1 extends Vehicle{
    void start(){
        System.out.println("Car starting");
    }
    void openSunroof(){
        System.out.println("sunroof opened");
    }
}

class Upcasting{
    public static void main(String args[]){
        Vehicle v = new Car1();

        v.start();

//        v.openSunroof();//it leads CE
        ((Car1)v).openSunroof();

    }
}