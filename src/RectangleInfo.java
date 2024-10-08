import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double width = 0;
        double height = 0;
        String trash = "";
        boolean done;

        do {
            done = false;
            System.out.print("Please enter width of the rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                if (width > 0) {
                    done = true;
                } else {
                    System.out.println("Invalid! Please enter a value greater than 0.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!done);

        do {
            done = false;
            System.out.print("Please enter height of the rectangle: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                if (height > 0) {
                    done = true;
                } else {
                    System.out.println("Invalid! Please enter a value greater than 0.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!done);

        double area = width * height;

        double perimeter = 2 * (width + height);

        double diagonal = Math.sqrt((width * width) + (height * height));

        System.out.printf("The area of the rectangle is: %.2f square units\n", area);
        System.out.printf("The perimeter of the rectangle is: %.2f units\n", perimeter);
        System.out.printf("The length of the diagonal is: %.2f units\n", diagonal);
    }
}
