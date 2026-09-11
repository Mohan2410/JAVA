import java.util.Scanner;
import java.util.InputMismatchException;
class Bike1 {
    private int gear;

    public void setGear(int gear) throws IllegalArgumentException {
        if (gear < 0 || gear > 5) {
            throw new IllegalArgumentException("Invalid gear. Its value between (0,5))");
        }
        this.gear = gear;
    }

    public int getGear() {
        return gear;
    }

    public void currentGear() {
        if (gear == 0) {
            System.out.println("Bike is a Neutral");
        } else {
            System.out.println("Bike is running on gear " + gear);
        }
    }
}
public class EncapsulationBikeRider {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bike1 b1 = new Bike1();
        while(true){
            try{
                System.out.println("\nChnage gear");

                b1.setGear(sc.nextInt());
                b1.currentGear();
            }
            catch(InputMismatchException e){
                System.out.println("Pass only Integer");
                sc.nextLine();
            }catch(IllegalArgumentException  e){
                System.out.println(e.getMessage());
            }
        }
    }
}
