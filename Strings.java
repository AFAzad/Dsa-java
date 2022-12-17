import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");

        String name = sc.nextLine();

        System.out.println("Your name is " + name);

        // concatenation

        String firstName = "Virat";
        String lastName = "Kolhi";

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);
        System.out.println(" ");
 
        // CharAt().
        System.out.println("Using charAt to Access all Charter of name");
        for (int i = 0; i < fullName.length(); i++) {
            
            System.out.println(fullName.charAt(i));
        }
    }
}
