import java.util.Scanner;

class FactorialLogic{
    static int findFactorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact * i;
        }
        return fact;
    }
}
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("The Factorial is: "+FactorialLogic.findFactorial(n));
    }
}
