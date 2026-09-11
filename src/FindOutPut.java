class FindOutPut {
    int x = 10;

    void m1(){
        System.out.println(x);
        x = 20;
    }
    public static void main(String[] args){
        FindOutPut s1 = new FindOutPut();
        s1.x = 15;
        System.out.println(s1.x);
        s1.m1();
        System.out.println(s1.x);
    }
}
