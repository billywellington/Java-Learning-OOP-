/**
 * StringsMethods.java
 *
 * A simple Java program that demonstrates various String methods such as:
 * - length() to find the number of characters in a string
 * - charAt() to get a character at a specific index
 * - indexOf() and lastIndexOf() to locate substrings
 * - contains() to check for substring existence
 * - toLowerCase() to change case
 * - isEmpty() and isBlank() to check for empty/blank strings
 * - concat() to join strings
 * - replace() to replace characters or substrings
 * - substring() to extract part of a string
 *
 * Author: Billy Wellington
 * Date: August 15, 2025
 * Version: 1.0
 */
public class StringsMethods {
    public static void main(String[] args) {
        String name = "Billy Wellington";
        String string_1 = "\n";
        String string = "PUBG is a great FPS game. I love playing BGMI & PUBG. PUBG is fun. The current version of PUBG is  3.9";

//        System.out.println(name.length());
//        System.out.println(name.charAt(3));
//        System.out.println(string.indexOf("PUBG",  string.indexOf("PUBG") + 1));
//        System.out.println(string.lastIndexOf("PUBG"));
//        System.out.println(string.contains("PUBG"));
//        System.out.println(string.toLowerCase().contains("PUBG"));
//        System.out.println(string_1.isEmpty());
//        System.out.println(string_1.isBlank());
//        System.out.println((string_1.length() == 0));

        String name_A = "Billy ";
        String name_B = "Wellington";
//        System.out.println("My name is " + name_A.concat(name_B));
//        String new_name = name_A.replace('B', 'W');
//        System.out.println("My new name is " + new_name);

        String name_C = name.replace("illy", "ob");
        System.out.println("My new name is " + name_C);

//        System.out.println(name.substring(1, 6));
    }
}
