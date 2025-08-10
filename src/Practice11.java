/**
 * Practice11.java
 *
 * Problem:
 *     Use the Pythagoras theorem to find the hypotenuse when the user provides two sides.
 *
 * Formula:
 *     hypotenuse = √(a² + b²)
 *
 * Approach:
 *     1. Prompt the user to enter the lengths of two sides of a right-angled triangle.
 *     2. Apply the Pythagoras theorem to calculate the hypotenuse.
 *     3. Output the result formatted to two decimal places.
 *
 * Level: Medium
 *
 * Author: Billy Wellington
 * Date: 2025-08-10
 */

import java.util.Scanner;

public class Practice11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter side A: ");
        int side_a = scanner.nextInt();

        System.out.println("Please enter side B: ");
        int side_b = scanner.nextInt();

        double side_hypo = Math.sqrt((side_a * side_a) + (side_b * side_b));
        System.out.printf("The hypotenuse side is %.2f%n", side_hypo);

        scanner.close();
    }
}
