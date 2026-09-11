import java.util.Scanner;
public class Bank{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        BankAccount acc = new BankAccount();
        while(true){
                 try{
                     System.out.println("\nEnter balance: ");
                     acc.setBalance(sc.nextDouble());
                     System.out.println("Current Balance: "+acc.getBalance());

                     break;
                 }catch(IllegalArgumentException e){
                     System.out.println("Error: "+ e.getMessage());
                 }
        }
    }
}