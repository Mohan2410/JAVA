class Example8 {
    int x;
    void m1(){
        x = 50;
    }

    void m2(){
        System.out.println(x);
    }
}
class GuessOutput{
    public static void main(String[] args){
        Example8 e1 = new Example8();
        System.out.println(e1.x);
        e1.m2();
        e1.x = 30;
        System.out.println(e1.x);
        e1.m2();
        e1.m1();
        System.out.println(e1.x);
        e1.m2();
    }
}