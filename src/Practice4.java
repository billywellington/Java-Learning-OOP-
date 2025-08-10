/**
 * Practice4.java
 *
 * Problem:
 *     Swap two integers using a temporary variable.
 *
 * Approach:
 *     1. Store the value of one variable in a temporary variable.
 *     2. Assign the value of the second variable to the first variable.
 *     3. Assign the value stored in the temporary variable to the second variable.
 *
 * Example:
 *     Input:
 *         x = 30
 *         y = 99
 *     Output:
 *         x = 99
 *         y = 30
 *
 * Level: Easy
 *
 * Author: Billy Wellington
 * Date: 2025-08-09
 */
public class Practice4 {
    public static void main(String[] args) {
        int x = 30, y = 99, temp;

        System.out.printf("Original value of x: %d\n", x);
        System.out.printf("Original value of y: %d\n", y);

        // Swap using a temporary variable
        temp = x;
        y = x;
        x = temp;

        System.out.printf("New value of x: %d\n", x);
        System.out.printf("New value of y: %d\n", y);
    }
}
