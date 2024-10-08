import java.util.Scanner;

public class CToFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("Please enter a temperature value in Celsius: ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine(); // Capture invalid input
                System.out.println("You have entered an invalid temperature value: " + trash);
                System.out.println("Please enter a valid temperature value in celsius.");
            }
        } while (!done);

        double fahrenheit = (9.0 / 5.0) * celsius + 32;
        System.out.printf("The temperature in Fahrenheit is: "+fahrenheit+"°F");
    }
}
