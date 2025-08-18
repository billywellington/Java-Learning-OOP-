import java.util.Arrays;
import java.util.Random;

/**
 * Problem: Find the maximum and minimum number in an integer array.
 *
 * <p>This program demonstrates three different methods to find
 * the maximum and minimum values in an integer array:
 * <ul>
 *     <li><b>Method 1:</b> Using a for loop with manual comparisons.</li>
 *     <li><b>Method 2:</b> Using {@link Arrays#sort(int[])} to sort the array.</li>
 *     <li><b>Method 3:</b> Using Java Streams with {@code Arrays.stream()}.</li>
 * </ul>
 *
 * <p>The program first generates random student marks between 20 and 100,
 * then prints them, and applies the three methods to determine the max and min values.
 *
 * <p>Author: Billy Wellington
 * Date: 16 August 2025
 */
public class Practice15_2 {

    /**
     * Main method that executes the program.
     *
     * @param args command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        Random random = new Random();

        // Create an array to store marks of 5 students
        int[] marks = new int[5];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = random.nextInt(20, 100); // Random marks between 20 and 100
        }

        System.out.println("\n--- Marks of Students ---");

        // Print out the marks
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }

        // Method 1: Find max and min using loops
        System.out.println("\nMethod 1: Using for loop");
        int max = 0;
        int min = 100;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
        }
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < min) {
                min = marks[i];
            }
        }
        System.out.println("The max number is " + max);
        System.out.println("The min number is " + min);

        // Method 2: Find max and min using sorting
        System.out.println("\nMethod 2: Using Arrays.sort()");
        Arrays.sort(marks);
        System.out.println("The max number is " + marks[marks.length - 1]);
        System.out.println("The min number is " + marks[0]);

        // Method 3: Find max and min using Java Streams
        System.out.println("\nMethod 3: Using Java Streams");
        System.out.println("The max number is " + Arrays.stream(marks).max().getAsInt());
        System.out.println("The min number is " + Arrays.stream(marks).min().getAsInt());
    }
}
