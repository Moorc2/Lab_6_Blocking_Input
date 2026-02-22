import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double gallonsInTank = 0;
        double mpg = 0;
        double pricePerGallon = 0;
        String trash = "";
        boolean done = false;

        // gallonsInTank input
        done = false; // start loop as False
        do {
            System.out.print("Enter gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                gallonsInTank = in.nextDouble();
                in.nextLine(); // clears the newline from the buffer
                if (gallonsInTank > 0) {
                    done = true; // we got a valid number so we can end the loop
                } else {
                    System.out.println("You have to enter a positive, non-zero value!");
                }
            } else {
                trash = in.nextLine();
                System.out.println("\nYou entered: " + trash);
                System.out.println("You have to enter a positive, non-zero value!");
            }
        } while (!done);

        // mpg input
        done = false;
        do {
            System.out.print("Enter fuel efficiency (miles per gallon): ");
            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                in.nextLine(); // clears the newline from the buffer
                if (mpg > 0) {
                    done = true; // we got a valid number so we can end the loop
                } else {
                    System.out.println("You have to enter a positive, non-zero value!");
                }
            } else {
                trash = in.nextLine();
                System.out.println("\nYou entered: " + trash);
                System.out.println("You have to enter a positive, non-zero value!");
            }
        } while (!done);

        // price input
        done = false;
        do {
            System.out.print("Enter price of gas per gallon: ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine(); // clears the newline from the buffer
                if (pricePerGallon > 0) {
                    done = true; // we got a valid number so we can end the loop
                } else {
                    System.out.println("You have to enter a positive, non-zero value!");
                }
            } else {
                trash = in.nextLine();
                System.out.println("\nYou entered: " + trash);
                System.out.println("You have to enter a positive, non-zero value!");
            }
        } while (!done);

        double costPerMile = pricePerGallon / mpg;
        double costFor100Miles = costPerMile * 100.0;
        double maxDistance = gallonsInTank * mpg;

        System.out.printf("Cost to drive 100 miles: $%.2f\n", costFor100Miles);
        System.out.printf("Maximum distance on full tank: %.2f miles", maxDistance);
    }
}