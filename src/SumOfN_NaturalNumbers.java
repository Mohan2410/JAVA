import java.util.Scanner;
class SumNaturalLogic{
    static int sumOfN(int n){
        int sum = 0;
        for(int i=0;i<=n;i++){
            sum = sum + i;
        }
        return sum;
    }
}
public class SumOfN_NaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a n numbers: ");
        int n = sc.nextInt();

        SumNaturalLogic.sumOfN(n);
        System.out.println(SumNaturalLogic.sumOfN(n));
    }
}
