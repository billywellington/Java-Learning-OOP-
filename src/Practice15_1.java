import java.util.Scanner;

/**
 * Practice15_1.java
 *
 * A simple Java program that:
 * - Uses an array to store the marks of 5 students.
 * - Takes input from the user for each student’s marks.
 * - Prints the marks one by one.
 *
 * Demonstrates:
 * - Arrays
 * - For loops
 * - User input with Scanner
 *
 * @author  Billy Wellington
 * @version 1.0
 * @since   2025-08-16
 */
public class Practice15_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] marks = new double[5]; // Array to store 5 student marks

        // Input loop
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Please enter marks for student " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
        }

        System.out.println("\n--- Marks of Students ---");

        // Output loop
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }

        scanner.close();
    }
}
