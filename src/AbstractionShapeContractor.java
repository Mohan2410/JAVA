interface Shape{
     void findArea();
}
class Rectangle implements Shape{
    private int len;
    private int breadth;

    public Rectangle(int len, int breadth){
        this.len = len;
        this.breadth = breadth;
    }

    @Override
    public void findArea() {
        int area = len * breadth;
        System.out.println("Area of Reactangle: "+area);
    }
}
class Square implements Shape{
    private int s;

    public Square(int s){
        this.s = s;
    }
    @Override
    public void findArea() {
        int area = s * s;
        System.out.println("Area of square is: " + area);
    }
}
class Circle implements Shape{
    private static final float PI = 3.14f;
    private int r;

    public Circle(int r){
        this.r = r;
    }
    @Override
    public void findArea(){
        float area = PI*(r*r);
        System.out.println("Area of Circle is: "+area);
    }
}
class Painter{
    void paint(Shape s){
        s.findArea();
    }
}
class AbstractionShapeContractor{
    public static void main(String[] args){
        Painter p = new Painter();
        p.paint(new Rectangle(5,3));
        p.paint(new Square(5));
        p.paint(new Circle(13));
    }
}