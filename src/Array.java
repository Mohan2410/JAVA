// Example 01:
// public class Array
// {
//     public static void main(String[] args) {
//         String[] employee = {"jack","james","david","root","broke"};
        
//         for(int i = 0;i < employee.length;i++){
//             System.out.println(employee[i]);
//         }

//         System.out.println(employee[2]);
//     }
// }

// Example 02: 

// public class Array
// {
//     public static void main(String[] args) {
        
//         String[] students = {"om","ram","sham","jay","sam"};

//         System.out.println(students[4]);
//     }
// }


// Example 03:

import java.util.Scanner;

public class Array {

     public static void main(String[] args) {
        String[] names = {"mohan","ram","jay","ajay","sham","sam"};
        int[] numbers = {1290,1230,3938,9137,102398,98374};

        for(int i = 0;i<names.length;i++)
        {
            System.out.println(names[i]);
        }

        System.out.println("Please enter a name: ");

        Scanner sc = new Scanner(System.in);
        String name = sc.next(); 

        for(int i = 0;i < names.length;i++)
        {
            if(name.equals(names[i]))
            {
                System.out.println(numbers[i]);
            }
        }
     }
}

