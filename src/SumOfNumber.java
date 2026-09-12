import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the element you want to add: ");
        int n = sc.nextInt();

        int sum = 0;
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            sum = sum + num;
        }

        System.out.println("Sum: "+sum);
    }
}
