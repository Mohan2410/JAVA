import java.util.Scanner;

class EvenOddLogic{
    static void findEvenOdd(int num){
        if(num % 2 == 0){
            System.out.println("It is Even Number");
        }else{
            System.out.println("It is Odd Number");
        }
    }
}
public class FindEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        EvenOddLogic.findEvenOdd(num);
    }
}
