/**
 * Practice8.java
 *
 * Problem:
 *     Ask the user for their birth year and calculate their current age.
 *
 * Approach:
 *     1. Prompt the user to enter their birth year.
 *     2. Read the birth year as an integer using Scanner.
 *     3. Subtract the birth year from the current year (2025) to find the age.
 *     4. Display the calculated age to the user.
 *
 * Note:
 *     The current year is hardcoded as 2025 for simplicity.
 *     For dynamic current year, Java's Calendar or LocalDate API can be used.
 *
 * Level: Easy
 *
 * Author: Billy Wellington
 * Date: 2025-08-09
 */

import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which year were you born?");
        int birthYear = scanner.nextInt();

        int currentYear = 2025;
        int age = currentYear - birthYear;

        System.out.printf("You are %d years old.%n", age);

        scanner.close();
    }
}
