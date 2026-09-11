class Example11{
    int x;
    int y;

    void setData(int x,int y){
        this.x = x;
        this.y = y;
    }
    void showData() {
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
class ReusableCode{
    public static void main(String[] args){
        Example11 e1 = new Example11();
        Example11 e2 = new Example11();

        e1.setData(10,20);
        e1.showData();

        e2.setData(30,40);
        e2.showData();

        e1.setData(1010,1020);
        e1.showData();

        e2.setData(8010,8020);
        e2.showData();
    }
}