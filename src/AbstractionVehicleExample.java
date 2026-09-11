interface Vehicle1{
    void engine();
    void breaks();
}
abstract class Bus implements Vehicle1{
    @Override
    public void breaks(){
        System.out.println("Bus has normal breaks");
    }
}
class RedBus extends Bus{
    @Override
    public void engine() {
        System.out.println("Red bus engine capicity is 40KMPH");
    }
}
class Volvo extends Bus{
    @Override
    public void engine(){
        System.out.println("Volvo bus engine capicity is 110KMPH");
    }
    @Override
    public void breaks(){
        System.out.println("volvo needs powerful breaks");
    }
}
class Driver{
    void driver(Vehicle1 v){
        v.engine();
        v.breaks();
    }
}
class AbstractionVehicleExample{
    public static void main(String[] args){
        Driver d = new Driver();
        d.driver(new RedBus());
        d.driver(new Volvo());
    }
}