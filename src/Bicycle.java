public class Bicycle{
    protected int cadence;
    protected int gear;
    protected int speed;

    public Bicycle(int cadence,int gear, int speed){
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;
    }
    public void setCadence(int cadence){
        this.cadence = cadence;
    }
    public void setGear(int gear){
        this.gear = gear;
    }
    public void applyBrake(int decrement){
        this.speed = speed - decrement;
    }
    public void speedUp(int increment){
        this.speed = speed + increment;
    }

    public void displayDetails(){
        System.out.println("Cadence: "+cadence);
        System.out.println("Gear: "+gear);
        System.out.println("Speed: "+speed+" km/hr");
    }
}
class MountainBike extends Bicycle{
    private int seatHeight;
    private String suspensionType;

    public MountainBike(int seatHeight, String suspensionType,int cadence, int gear, int speed){
        super(cadence, gear,speed);
        this.seatHeight = seatHeight;
        this.suspensionType = suspensionType;
    }

    public void setSeatHeight(int seatHeight){
        this.seatHeight = seatHeight;
    }
    public void setSuspensionType(String suspensionType){
        this.suspensionType = suspensionType;
    }

    @Override
    public void applyBrake(int decrement) {
        super.applyBrake(decrement);
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("Seat Height: "+seatHeight+" insches");
        System.out.println("Suspension Type: "+suspensionType);
    }
}

class RoadBike extends Bicycle{
    private String handlebarType;
    private int tireWidth;

    public RoadBike(String handlebarType,int tireWidth, int cadence, int gear, int speed){
        super(cadence, gear, speed);
    }

    public void setHandlebarType(String handlebarType){
        this.handlebarType = handlebarType;
    }
    public void setTireWidth(int tireWidth){
        this.tireWidth = tireWidth;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("Handler Type: "+handlebarType);
        System.out.println("Tire Width: "+tireWidth);
    }
}
class BicycleTest{
    public static void main(String[] args){
        MountainBike m1 = new MountainBike(10,"Full",30,2,40);
        RoadBike r1 = new RoadBike("Drop",25,40,20,5);

        System.out.println("Mountain Bike Dtails: ");
        m1.displayDetails();

        System.out.println("Road Bike Details:");
        r1.displayDetails();

        m1.speedUp(200);
        m1.setGear(2);
        m1.setSeatHeight(24);
        m1.setSuspensionType("Front");

        r1.applyBrake(2);
        r1.setGear(5);
        r1.setHandlebarType("Flat");
        r1.setTireWidth(28);

        System.out.println("After Modification");
        System.out.println("Mountain Bike Speed: "+m1.speed+" km/hr");
        System.out.println("Road Bike Speed: "+r1.speed+" k/hr");

        System.out.println("===============Updated Mountain bike details============");
        m1.displayDetails();

        System.out.println("===============Road Bike Details==============");
        r1.displayDetails();
    }
}