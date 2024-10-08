import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double gallons = 0;
        double fuelEfficiency = 0;
        double pricePerGallon = 0;
        String trash = "";
        boolean done;

        do {
            done = false;
            System.out.print("How many gallons of gas in the tank?: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                if (gallons > 0) {
                    done = true;
                } else {
                    System.out.println("Invalid! Enter a value greater than 0.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!done);

        do {
            done = false;
            System.out.print("What is the fuel efficiency (miles per gallon)?: ");
            if (in.hasNextDouble()) {
                fuelEfficiency = in.nextDouble();
                if (fuelEfficiency > 0) {
                    done = true;
                } else {
                    System.out.println("Invalid! Enter a value greater than 0.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!done);

        do {
            done = false;
            System.out.print("What is the price of gas per gallon?: ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                if (pricePerGallon > 0) {
                    done = true;
                } else {
                    System.out.println("Invalid! Enter a value greater than 0.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!done);

        double costPer100Miles = (100 / fuelEfficiency) * pricePerGallon;
        double distanceWithFullTank = gallons * fuelEfficiency;

        System.out.printf("The cost to drive 100 miles is: $%.2f\n", costPer100Miles);
        System.out.printf("The car can go %.2f miles with a full tank of gas.\n", distanceWithFullTank);
    }
}

