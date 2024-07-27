// for loop

// import java.util.Scanner;

// public class Loop
// {
//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a number: ");
//         int n = sc.nextInt();

//         for(int num = 0;num < n;num++)
//         {
//             System.out.println("Mohan");
//         }
//     }
// }

// while loop
// import java.util.Scanner;

// public class Loop
// {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a number: ");
//         int n = sc.nextInt();

//         int num = 1;

//         while(num<n)
//         {
//             System.out.println(num);
//             num++;
//         }
//         System.out.println(num);
//     }
// }


// do while loop

import java.util.Scanner;

public class Loop
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enetr a number: ");
        int n = sc.nextInt();

        int num = 1;
        do
        {
            System.out.println(num);
            num++;
        }while(num<=5);
    }
}