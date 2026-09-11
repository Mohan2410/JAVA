class Practice{
    static void m1(){
        System.out.println("m1 is calling");
    }

    static int m2(){
        System.out.println("m2 is calling");
        return 50;
    }
    public static void main(String[] args){
        m1();

//        int x = m1(); CE:incompatible types void cant be convert into int

        System.out.println(m2());

        m2();

        int x = m2();
        System.out.println(x);

        System.out.println(m2());


    }
}