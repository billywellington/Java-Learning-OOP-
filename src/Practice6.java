/**
 * Practice6.java
 *
 * Problem:
 *     Swap two strings without using a temporary variable.
 *
 * Approach:
 *     1. Concatenate both strings into one.
 *     2. Extract the original second string from the combined string using substring().
 *     3. Extract the original first string using substring() again.
 *
 * Example:
 *     Input:
 *         string1 = "Billy"
 *         string2 = "Wellington"
 *     Output:
 *         string1 = "Wellington"
 *         string2 = "Billy"
 *
 * Note:
 *     substring(beginIndex) → includes character at beginIndex.
 *     substring(beginIndex, endIndex) → includes beginIndex, excludes endIndex.
 *
 * Author: Billy Wellington
 * Date: 2025-08-09
 */
public class Practice6 {
    public static void main(String[] args) {
        String string1 = "Billy";
        int length_string1 = string1.length();
        System.out.printf("Original String 1: %s\n", string1);

        String string2 = "Wellington";
        int length_string2 = string2.length();
        System.out.printf("Original String 2: %s\n", string2);

        System.out.printf("Length of string 1: \"%s\" is %d\n", string1, length_string1);
        System.out.printf("Length of string 2: \"%s\" is %d\n", string2, length_string2);

        String comb_strings = string1 + string2;
        System.out.println("The two strings combined give: " + "\"" + comb_strings + "\"");

        string1 = comb_strings.substring(length_string1);
        System.out.printf("New String 1: %s\n", string1);

        string2 = comb_strings.substring(0, length_string1);
        System.out.printf("New String 2: %s\n", string2);

        length_string1 = string1.length();
        length_string2 = string2.length();

        System.out.printf("Length of string 1: %s is %d\n", string1, length_string1);
        System.out.printf("Length of string 2: %s is %d\n", string2, length_string2);
    }
}
