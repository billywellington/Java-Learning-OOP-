/**
 * LogicalOperators.java
 *
 * Problem:
 *     Demonstrate the use of logical operators (OR and NOT) in decision-making.
 *
 * Approach:
 *     - Ask the user if they want to play a game.
 *     - Use '&&' (logical AND) to check if the answer is BOTH "yes" AND "y".
 *     - Use `||` (logical OR) to check if the answer is either "yes" or "y".
 *     - Use `!` (logical NOT) to handle cases where the answer is not "yes".
 *     - Provide different responses based on the user's input.
 *
 * Notes:
 *     - `equalsIgnoreCase()` is used for case-insensitive string comparison.
 *     - The current `else if` condition only checks for "not yes", meaning "y" will not trigger it,
 *       but will already be caught by the first condition.
 *
 * Level: Easy
 *
 * Author: Billy Wellington
 * Date: 2025-08-10
 */

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to play");
        String ans = scanner.nextLine();

        if ((ans.equalsIgnoreCase("yes")) || (ans.equalsIgnoreCase("y"))) {
            System.out.println("Welcome to PUBG");
        }
        else if (!ans.equalsIgnoreCase("yes")) {
            System.out.println("Game is over");
        }
        else {
            System.out.println("Please try again!!");
        }
    }
}
