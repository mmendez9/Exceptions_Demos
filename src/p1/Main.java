package p1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of a circle: ");

        try {
            double radius = input.nextDouble();

            if (radius > 0) {
                double area = Math.PI * Math.pow(radius, 2);

                System.out.printf("The area of the circle with a radius of % f is %f%n", radius, area);
            }
            else
                System.out.println("Zero or negative radius invalid");

        } catch (InputMismatchException e) {
            System.out.println(e);
            System.out.println("You messed up, number is required");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("You messed up, I don't know why");
        }
    }
}
