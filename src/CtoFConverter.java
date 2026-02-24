// Program that converts C to F and indicates when its freezing or boiling
// First ask for a temperature
// convert temp from C to F using (C x (9/5) + 32
// If celsius is 0 it freezing, if its 100 its boiling
// output using Ifs, else input is not valid

import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius;
        boolean validInput = false;
        double freezing = 0;
        double boiling = 100;


        while (!validInput) {
            System.out.print("Please enter temperature in Celsius: ");

            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                validInput = true;

                double fahrenheit = (celsius * (9.0 / 5.0)) + 32.0;
                System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit");
                if  (celsius == freezing)
                {
                    System.out.println(celsius +" degrees Celsius or " + fahrenheit + " degrees Fahrenheit is freezing!");
                }
                if  (celsius == boiling)
                {
                    System.out.println(celsius +" degrees Celsius or " + fahrenheit + " degrees Fahrenheit is boiling!");
                }
            } else {
                String trash = in.next();
                System.out.println("You did not enter a valid temperature, you entered " + trash + ". Try again.");
            }
        }

    }
}