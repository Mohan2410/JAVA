// public class Fun_Args
// {
//     public static void main(String[] args) {
//         int ans = add(10, 2);
//         System.out.println(ans);
//     }

//     static int add(int a,int b)
//     {
//         int add = a + b;
//         return add;
//     }
// }


// find the are of the rectange using the functing returning values

import java.util.Scanner;

public class Fun_Args{
    public static void main(String[] args) {
        double ab = rect();
        System.out.println("area is: "+ab);
    }

    static double rect(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        double len = sc.nextDouble();

        System.out.println("Enter the breadth: ");
        double breadth = sc.nextDouble();

        double area = len * breadth;
        return area;
    }
}