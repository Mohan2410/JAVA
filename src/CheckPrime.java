import java.util.Scanner;

class primeLogic{
    static boolean checkPrime(int num) {
        int i = 0;
        int factors = 0;

        for(i=1;i<num;i++){
            if(num % i == 0){
                factors++;
            }
        }
        return factors == 2;
    }

}
public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        System.out.println(primeLogic.checkPrime(n));
    }
}
