import java.util.Random;
import java.util.Scanner;

public class Practice{
    public static void main(String[] args) 
    {

        System.out.println("Welcome");

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your good name: ");
        String st = sc.next();
        
        System.out.println("Hello "+st);

        System.out.println("Shall we start the game?");
        System.out.println("\t1.Yes");
        System.out.println("\t2.No");
        
        int beginAnswer = sc.nextInt();

        while (beginAnswer != 1) 
        {
            System.out.println("Shall we start the game?");
            System.out.println("\t1.Yes");
            System.out.println("\t2.No");

            beginAnswer = sc.nextInt();
        }

        Random rm = new Random();
        int number = rm.nextInt(20)+1;
        

        System.out.println("Please guess the number: ");
        int userInput = sc.nextInt();

        int timesTried = 0;
        boolean hasWon = false;
        boolean shouldFinish = false;

        while (!shouldFinish) {
            timesTried++;
            // timesTried = timesTried + 1;

            if(timesTried < 5)
            {
                if (userInput == number) 
                {
                    hasWon = true;
                    shouldFinish = true;    
                }
                else if(userInput > number)
                {
                    System.out.println("Guess lower");
                    userInput = sc.nextInt();
                }
                else
                {
                    System.out.println("Guess higher");
                    userInput = sc.nextInt();
                }
            }
            else
            {
                shouldFinish = true;
            }
        }
        
        if(hasWon)
        {
            System.out.println("congrulations! you have guessed in your " + timesTried + "guess.");
        }
        else
        {
            System.out.println("Game over...");
            System.out.println("The number was: "+number);
        }
    }
}