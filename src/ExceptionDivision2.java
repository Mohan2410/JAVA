import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDivision2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    while(true){
            try{
                System.out.println("Enter FNO: ");
                int a = sc.nextInt();

                System.out.println("Enter SNO: ");
                int b = sc.nextInt();

                int res = a/b;
                System.out.println("Result is: "+res);
                break;

            }catch(InputMismatchException e1){
                System.out.println("Error: Enter only integers...");
                sc.nextLine();
            }
            catch (ArithmeticException e1){
                System.out.println("do not enter a zero as a second value");
            }
        }
    }
}
