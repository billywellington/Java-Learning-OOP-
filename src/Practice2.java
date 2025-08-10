/**
 * Practice2.java
 *
 * Problem:
 *     Create a program that converts temperatures from Celsius to Fahrenheit.
 *
 * Formula:
 *     F = (C × 9/5) + 32
 *     where:
 *         F = temperature in Fahrenheit
 *         C = temperature in Celsius
 *
 * Approach:
 *     1. Define a Celsius temperature (temp_c).
 *     2. Apply the conversion formula to get the Fahrenheit equivalent.
 *     3. Print the result to the console.
 *
 * Example:
 *     Input: C = 0
 *     Output: F = 32
 *
 * Difficulty Level: Medium
 *
 * Author: Billy Wellington
 * Date: 2025-08-09
 */
public class Practice2 {
    public static void main(String[] args) {
        float temp_c = 0, temp_f;

        temp_f = ((temp_c * 9) / 5) + 32;

        System.out.printf("%.2f°C = %.2f°F%n", temp_c, temp_f);
    }
}
