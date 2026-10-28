import java.util.Scanner;
class FindingMaxOf3{
    static void maxOfThree(int num1,int num2,int num3){
        if(num1 > num2 && num1 > num3){
            System.out.println("1st is maximum");
        }else if(num2 > num1 && num2 > num3){
            System.out.println("2nd is maximum");
        }else{
            System.out.println("3rd is maximum");
        }
    }

}
public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd number: ");
        int num3 = sc.nextInt();

        FindingMaxOf3.maxOfThree(num1,num2,num3);

    }
}
