// Example 01: Returning type
// import java.util.Scanner;

// public class Main 
// {
//     public static void main(String[] args)
//     {
//         int ans = sum2();
//         System.out.println(ans);
//     }

//     static int sum2()
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter 1st number: ");
//         int num1 = sc.nextInt();
//         System.out.println("Enter 2nd number: ");
//         int num2 = sc.nextInt();
//         int sum = num1 + num2;
//         return sum;
//     }

//     static void sum()
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter 1st number: ");
//         int num1 = sc.nextInt();
//         System.out.println("Enter 2nd number: ");
//         int num2 = sc.nextInt();
//         int sum = num1 + num2;
//         System.out.println("Addition is: "+ sum);
//     }
// }



// Example 02: Non returning value

// public class Main 
// {
//     public static void main(String[] args) {
//         fun();
//         fun();
//         fun();
//     }

//     static void fun()
//     {
//         System.out.println("Helloworld");
//     }
// }

// Example 03: Non returning type 

import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) {
       sum();
       sum();
       sum(); 
    }

    static void sum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);
    }
}