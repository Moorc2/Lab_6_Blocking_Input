import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double width = 0;
        double height = 0;
        String trash = "";
        boolean done = false;

        // width input
        done = false;
        do {
            System.out.print("Please enter the width of the rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                if (width > 0) {
                    done = true;
                } else {
                    System.out.println("You have to enter a positive, non-zero value!");
                }
            } else {
                trash = in.nextLine();
                System.out.println("\nYou entered: " + trash);
                System.out.println("You have to enter a positive, non-zero value!");
            }
        } while (!done);

        // height input
        done = false;
        do {
            System.out.print("Enter the rectangle height: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine();
                if (height > 0) {
                    done = true;
                } else {
                    System.out.println("You have to enter a positive, non-zero value!");
                }
            } else {
                trash = in.nextLine();
                System.out.println("\nYou entered: " + trash);
                System.out.println("You have to enter a positive, non-zero value!");
            }
        } while (!done);

        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = ((width * width) + (height * height));
        diagonal = Math.sqrt(diagonal);

        System.out.printf("Area: %.2f\n", area);
        System.out.printf("Perimeter: %.2f\n", perimeter);
        System.out.printf("Diagonal: %.2f\n", diagonal);

        in.close();
    }
}