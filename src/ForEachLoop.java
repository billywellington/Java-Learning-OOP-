/**
 * Program: For Loop vs For-Each Loop Demonstration
 *
 * Description:
 * This program demonstrates the difference between the traditional `for` loop
 * and the enhanced `for-each` loop in Java.
 *
 * Learning Objectives:
 *  - Understand how a standard `for` loop iterates using an index.
 *  - Learn how the `for-each` loop simplifies iteration over arrays.
 *  - Compare the two approaches and recognize when each might be useful.
 *
 * Features:
 *  - Creates a String array containing African country names.
 *  - Prints all elements using a standard `for` loop with an index.
 *  - Prints all elements again using a `for-each` loop without explicitly using an index.
 *
 * Author: Billy Wellington
 * Date: 18 August 2025
 */
public class ForEachLoop {
    public static void main(String[] args) {

        // Create an array of String values (African country names)
        String[] africa = {"Zambia", "Gambia", "SA", "Niger"};

        // --- Demonstration of the traditional for loop ---
        // This loop uses an index variable (i) to access each array element.
        for (int i = 0; i < africa.length; i++) {
            System.out.println(africa[i]); // prints element at index i
        }

        System.out.println("..."); // separates the two outputs for clarity

        // --- Demonstration of the for-each loop ---
        // This loop directly iterates through the elements of the array
        // without needing an index variable.
        for (String country : africa) {
            System.out.println(country); // prints each element directly
        }
    }
}
