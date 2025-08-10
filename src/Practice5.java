/**
 * Practice5.java
 *
 * Problem:
 *     Swap two integers without using a temporary variable (use arithmetic).
 *
 * Approach:
 *     1. Add both integers and store in one variable.
 *     2. Subtract the second variable from the sum to get the original first variable.
 *     3. Subtract the new second variable from the sum to get the original second variable.
 *
 * Example:
 *     Input:
 *         x = 30
 *         y = 99
 *     Output:
 *         x = 99
 *         y = 30
 *
 * Level: Medium
 *
 * Author: Billy Wellington
 * Date: 2025-08-09
 */
public class Practice5 {
    public static void main(String[] args) {
        int x = 30, y = 99;

        System.out.printf("Original value of x: %d\n", x);
        System.out.printf("Original value of y: %d\n", y);

        // Swap without a temporary variable using arithmetic
        x = x + y; // x now holds the sum of both
        y = x - y; // y becomes the original x
        x = x - y; // x becomes the original y

        System.out.printf("New value of x: %d\n", x);
        System.out.printf("New value of y: %d\n", y);
    }
}
