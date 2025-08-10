/**
 * Practice7.java
 *
 * Problem:
 *     Ask the user for their name and greet them.
 *
 * Approach:
 *     1. Use Scanner to read user input from the console.
 *     2. Prompt the user to enter their name.
 *     3. Read the full line entered by the user.
 *     4. Print a greeting message using the entered name.
 *
 * Level: Easy
 *
 * Author: Billy Wellington
 * Date: 2025-08-09
 */

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String user_name;

        System.out.println("Please enter your name: ");

        user_name = scanner.nextLine();

        System.out.printf("Hello, %s!%n", user_name);

        scanner.close();
    }
}
