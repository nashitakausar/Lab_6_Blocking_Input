import java.util.Scanner;
import java.util.Random;

public class HighOrLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();

        int randomNum = generator.nextInt(10) + 1;

        int guess = 0;
        String trash = "";
        boolean done;

        do {
            done = false;
            System.out.print("Guess any number between 1 and 10: ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                if (guess >= 1 && guess <= 10) {
                    done = true;
                } else {
                    System.out.println("The number should be between 1 and 10.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!done);

        // Display the random number and the user's guess result
        System.out.println("The random number was: " + randomNum);
        if (guess < randomNum) {
            System.out.println("Your guess was too low!");
        } else if (guess > randomNum) {
            System.out.println("Your guess was too high!");
        } else {
            System.out.println("On the money!");
        }
    }
}
