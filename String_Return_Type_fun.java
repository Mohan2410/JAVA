// Example: 
// import java.util.Scanner;

// public class String_Return_Type_fun
// {
//     public static void main(String[] args) {
//         String message = greet();
//         System.out.println(message);
//     }

//     static String greet()
//     {
//         String greet = "How are you?";
//         return greet;
//     }
// }

// Example: WAP to create a function using the arguments/parameters

public class String_Return_Type_fun{
    public static void main(String[] args) {
        String msg = fun(" Mohan Gawande");
        System.out.println(msg);
    }

        static String fun(String name)
        {
            String msg = "Hello"+name;
            return msg;
        }
}