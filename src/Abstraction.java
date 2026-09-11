abstract class AbstractionExample{
    abstract void m1();
}
class AbstractionSample extends AbstractionExample{
    void m1(){
        System.out.println("m1() is executed from AbstractionSample class ");
    }
}
class AbstractionAbc extends AbstractionExample{
    void m1(){
        System.out.println("m1() is executed from the AbstractionAbc class");
    }
}
class Abstraction{
    static void main(String[] args) {
        AbstractionExample a1 = new AbstractionSample();
        a1.m1();

        a1 = new AbstractionAbc();
        a1.m1();
    }
}