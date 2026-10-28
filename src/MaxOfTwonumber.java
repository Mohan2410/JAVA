import java.util.Scanner;

class Maximum{
    static void maxOfTwo(int num1,int num2){
        if(num1 > num2){
            System.out.println("Num1 is maximum");
        }else{
            System.out.println("Num2 is maximum");
        }
    }
}
public class MaxOfTwonumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter Second Number: ");
        int num2 = sc.nextInt();

        Maximum.maxOfTwo(num1,num2);
    }
}
