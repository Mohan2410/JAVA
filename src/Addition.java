/* DAP with user defined method for adding given two integer and reeturn result to the method caller, In
    method calling method storing result and print that result on console
*/
import java.util.Scanner;

class Addition{
    static int add(int a,int b){
        int c = a + b;
        return c;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter FNO: ");
        int a = sc.nextInt();

        System.out.println("Enter SNO: ");
        int b = sc.nextInt();

        int x = Addition.add(a,b);
        System.out.println("Result is: "+x);
    }
}