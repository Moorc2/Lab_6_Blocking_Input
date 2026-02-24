


import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();

        int numberToGuess = generator.nextInt(10) + 1; // makes sure the number is 1 - 10, without + 1 would be 0 - 9
        int guess = 0;
        String trash = "";
        boolean done = false;

        // guess input loop
        do {
            System.out.print("Let's play High or Low. Enter your guess (1-10): ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                in.nextLine();
                if (guess >= 1 && guess <= 10) {
                    done = true;
                } else {
                    System.out.println("Your guess has to be between 1 and 10.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("\nYou entered: " + trash);
                System.out.println("Your guess has to be between 1 and 10.");
            }
        } while (!done);

        System.out.println("The number was: " + numberToGuess);

        if (guess > numberToGuess) {
            System.out.println("Your guess was too high!");
        } else if (guess < numberToGuess) {
            System.out.println("Your guess was too low!");
        } else {
            System.out.println("You guessed it!");
        }
    }
}