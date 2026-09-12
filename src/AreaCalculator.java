import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Area of Rectangle");
        System.out.println("Enter the Length: ");
        int len = Integer.parseInt(sc.nextLine());

        System.out.println("Enter the breadth: ");
        int bre = Integer.parseInt(sc.nextLine());

        double rectArea = len * bre;
        System.out.println("Area of Rect: "+rectArea);

        System.out.println("Area of Circle");
        System.out.println("Enter the Radius: ");
        int radius = Integer.parseInt(sc.nextLine());

        double circleRadius = 3.14 * radius * radius;
        System.out.println("Area of Circle: "+circleRadius);

        System.out.println("Area of Triangle");
        System.out.println("Enter the base: ");
        int base = Integer.parseInt(sc.nextLine());

        System.out.println("Enter the height: ");
        int height = Integer.parseInt(sc.nextLine());

        double triArea = base * height;
        System.out.println("Area of Triangle is: "+triArea);
    }
}
