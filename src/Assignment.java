class Example5 {
    int x;
    int y;

    void m1(Example5 e) {
        System.out.println(x + " " + y);
        System.out.println(e.x + " " + e.y);
    }
}
class Assignment{
    public static void main(String[] args){
        Example5 e1 = new Example5();
        Example5 e2 = new Example5();

        e1.m1(e2);

        e2.m1(e1);

        e1.m1(e1);
        e2.m1(e2);
    }
}