import java.util.Scanner;

public class MakeUserName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter firstName: ");
        String firstName = sc.nextLine().trim();
        System.out.println("Enter lastName");
        String lastName = sc.nextLine().trim();

        // Create username (lowercase, no space)
        String username = (firstName + lastName).toLowerCase();

        // Create initials (uppercase first letters)
        String initials = ("" + firstName.charAt(0) + lastName.charAt(0)).toUpperCase();
        // Print results

        System.out.println("Username: "+username);
        System.out.println("Initials: "+initials);

    }
}
