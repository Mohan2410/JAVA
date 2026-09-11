abstract class Example55{
    abstract void m1();
    abstract void m2();
}
abstract class Sample55 extends Example55{
    void m1(){
        System.out.println("m1() method is execute from class sample55 for the object  "+this);
    }
}
class Abc extends Sample55{
    void m2() {
        System.out.println("m2() method is execute from class Abc for the object  " + this);
    }
}
class Xyz extends Sample55{
    void m2(){
        System.out.println("m2() method is execute from class Xyz for the object  "+this);
    }
}
class AbstractionMultipleAbstractMethod{
    static void main(String[] args) {
        Example55 e1 = new Abc();
        e1.m1();
        e1.m2();

        e1 = new Xyz();
        e1.m1();
        e1.m2();



    }
}