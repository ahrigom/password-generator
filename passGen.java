
import java.util.Random;
import java.util.Scanner;

public class passGen {
    // Variables
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Get the passwrod length
        System.out.print("How long do you want your password to be? (input a number): ");
        int passwordLength = input.nextInt();

        // Build character pool
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "123456789";
        String symbols = "!@#$%&";

        // Combine the individual charater pools into one
        String characterPool = uppercase + lowercase + numbers + symbols;

        // Create an empty password
        String password = "";

        // Generate the password
        for (int i = 0; i < passwordLength; i++){
            // Picks a random index from the character pool
            int randomIndex = rand.nextInt(characterPool.length());
            // Pulls the value form that randomly chose index
            char randomChar = characterPool.charAt(randomIndex);
            // Adds that randomly chose character to the empty password
            password += randomChar;
        }

        System.out.println(password);


    }
}

