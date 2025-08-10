/**
 * Practice1.java
 *
 * Problem:
 *     Declare variables for your name, age, and favorite hobby.
 *     Print them in a single sentence.
 *
 * Approach:
 *     1. Declare variables to hold name (String), age (int), and hobby (String).
 *     2. Use System.out.printf to format and print the sentence.
 *
 * Example Output:
 *     My name is Bro, and I am 30 years old. My hobby is Gaming.
 *
 * Difficulty Level: Easy
 *
 * Author: Billy Wellington
 * Date: 2025-08-09
 */
public class Practice1 {
    public static void main(String[] args) {
        int age = 30;
        String name = "Bro";
        String hobby = "Gaming";
        System.out.printf("My name is %s, and I am %d years old. My hobby is %s.%n", name, age, hobby);
    }
}
