import java.util.Scanner;

public class Largest
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter 3rd number: ");
        int num3 = sc.nextInt();

        if(num1 > num2)
        {
            System.out.println("1st number is largest");
        }
        else if(num2 > num3)
        {
            System.out.println("2nd is largest");
        }
        else
        {
            System.out.println("third is largest");
        }

    }
}