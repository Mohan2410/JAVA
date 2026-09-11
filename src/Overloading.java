// method overloading is method name is same but number of arguments are different

// Example 01

// public class Overloading{
//     public static void main(String[] args) {
//         int ans = sum(10, 20);
//         System.out.println(ans);

//         int ab = sum(2,3,4);
//         System.out.println(ab);
//     }
//     static int sum(int a,int b)
//     {
//         return a + b;
//     }

//     static int sum(int a,int b,int c)
//     {
//         return a + b + c;
//     }
// }

// Example 02

import java.util.*;

public class Overloading{
    public static void main(String[] args) {
        demo(10,20,4);
        // demo();//VarArgs parameter can not be empty thats why it gives error in terms of overriding
        demo("moahan","om","ram");
    }
    
    static void demo(int...v)
    {
        System.out.println(Arrays.toString(v));
    }
    

    static void demo(String...v)
    {
        System.out.println(Arrays.toString(v));
    }
}