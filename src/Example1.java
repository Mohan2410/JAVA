class Example1{
    static int a = 10;
    static int b = 20;

    int x = 30;
    int y = 40;

    public static void main(String[] args){
        Example1 e1 = new Example1();
        Example1 e2 = null;

        //we can call the static variable by using the four(4) ways in java

        //1]  directly by using their name
        System.out.println("a: "+a);

        //2]  by using the class name
        System.out.println("a: "+Example1.a);

        //3]  by using object refrenced variable
        System.out.println("a: "+e1.a);

        //4]  by using null refrenced variable
        System.out.println("a: "+e2.a);

//        System.out.println(x);    CE: non-static variable x cannot be referenced from a static
//        System.out.println(Example.x); CE: cannot find symbol  variable x
//        System.out.println("x: "+e2.x);  RE: NullPointerException


    }
}