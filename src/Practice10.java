/**
 * Practice10.java
 *
 * Problem:
 *     Ask the user for the radius of a circle and calculate the area.
 *
 * Formula:
 *     Area = π * radius²
 *
 * Approach:
 *     1. Prompt the user to enter the radius of a circle.
 *     2. Use the formula with π ≈ 3.14159 to calculate the area.
 *     3. Print the area formatted to 2 decimal places.
 *
 * Level: Easy
 *
 * Author: Billy Wellington
 * Date: 2025-08-10
 */

import java.util.Scanner;

public class Practice10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double pi = 22.0 / 7; // Use floating-point division for accuracy

        System.out.println("Please enter radius value: ");
        double radius = scanner.nextDouble();

        double area = pi * radius * radius;

        System.out.printf("Area is %.2f", area);

        scanner.close();
    }
}
