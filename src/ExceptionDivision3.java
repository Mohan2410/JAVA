import java.util.Scanner;
import java.util.InputMismatchException;
public class ExceptionDivision3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        while(true){
            try{
                System.out.println("Enter FNO: ");
                a = sc.nextInt();
                break;
            }
            catch(InputMismatchException e){
                System.out.println("Error: Enter only integers");
                sc.nextLine();
            }
        }
        while(true){
            try{
                System.out.println("Enter SNO: ");
                int b = sc.nextInt();

                int c = a/b;
                System.out.println("Result is: "+c);
                break;
            }
            catch(InputMismatchException e){
                System.out.println("Error: Enter only integers");
                sc.nextLine();
            }catch (ArithmeticException e){
                System.out.println("Error: Don't Enter second value as a zero");
            }
        }
    }
}