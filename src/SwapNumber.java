import java.util.Scanner;

class SwapDemo{
    static void swapNumber(int a,int b){
        System.out.println("Before Swaping the values of a="+a+" and b="+b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swaping the values of a="+a+" and b="+b);
    }
}

public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int a = sc.nextInt();
        System.out.print("Enter b values: ");
        int b = sc.nextInt();

        SwapDemo.swapNumber(a,b);


    }
}
