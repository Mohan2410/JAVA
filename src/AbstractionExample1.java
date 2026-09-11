abstract class Exampleab{
    static int a = 10;
    int x = 20;

    void m1(){
        System.out.println("m1() method is executed from class Exampleab for the object "+this);
    }
}

class Sampleab extends Exampleab{

}
public class AbstractionExample1{
    public static void main(String[] args){
        Exampleab e1;

//        e1 = new Exampleab(); CE: we cannot create the object of the abstract class
//        e1.m1();

        e1 = new Sampleab();
        e1.m1();

    }
}