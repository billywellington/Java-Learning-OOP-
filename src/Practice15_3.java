import java.util.Random;

/**
 * Problem: Reverse an array of integers without using another array (in-place).
 *
 * Description:
 * This program creates an integer array with random values, displays it,
 * and then reverses the array elements in place (without creating another array).
 * The reversing is done using a two-pointer approach: one pointer starts at the
 * beginning of the array, and the other at the end, swapping elements until they meet.
 *
 * Steps:
 * 1. Generate random integers between 10 and 50 for the array.
 * 2. Print the original array.
 * 3. Reverse the array in place using the two-pointer method.
 * 4. Print the reversed array.
 *
 * Example Output:
 * Array of numbers: [35 21 42 18 49 ]
 * The Reversed Array : [49 18 42 21 35 ]
 *
 * Author: Billy Wellington
 * Date: 16 August 2025
 */
public class Practice15_3 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10, 50);
        }

        System.out.print("Array of numbers: [");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.print("]");

        int start = 0, end = numbers.length - 1;

        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }

        System.out.print("\nThe Reversed Array : [");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.print("]\n");
    }
}
