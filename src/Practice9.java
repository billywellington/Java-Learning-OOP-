/**
 * Practice9.java
 *
 * Problem:
 *     Create a BMI calculator that asks for weight (kg) and height (m),
 *     then prints the result to 2 decimal places.
 *
 * Formula:
 *     BMI = weight / (height * height)
 *
 * Approach:
 *     1. Prompt the user to enter their height in meters.
 *     2. Prompt the user to enter their weight in kilograms.
 *     3. Calculate BMI using the formula.
 *     4. Print the BMI value formatted to 2 decimal places.
 *
 * Level: Medium
 *
 * Author: Billy Wellington
 * Date: 2025-08-09
 */

import java.util.Scanner;

public class Practice9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your height in meters: ");
        float height = scanner.nextFloat();

        System.out.println("Please enter your weight in kilograms: ");
        float weight = scanner.nextFloat();

        double bmi_value = weight / (height * height);

        System.out.printf("Your BMI is %.2f%n", bmi_value);

        scanner.close();
    }
}
