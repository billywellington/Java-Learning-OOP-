/**
 * SwitchCase.java
 *
 * Problem:
 *     Demonstrate the use of a switch-case statement to print the current day.
 *
 * Approach:
 *     - Declare a String variable to represent the day of the week.
 *     - Use a switch-case statement to match the day and print a corresponding message.
 *
 * Notes:
 *     - Each case uses the `break` statement to prevent fall-through.
 *     - The example uses "Sunday" as the day value, so only the Sunday case will execute.
 *
 * Level: Easy
 *
 * Author: Billy Wellington
 * Date: 2025-08-10
 */
public class SwitchCase {
    public static void main(String[] args) {
        String day = "PUBG";

        switch (day) {
            case "Sunday":
                System.out.printf("It is %s today!%n", day);
                break;
            case "Monday":
                System.out.printf("It is %s today!%n", day);
                break;
            case "Tuesday":
                System.out.printf("It is %s today!%n", day);
                break;
            case "Wednesday":
                System.out.printf("It is %s today!%n", day);
                break;
            case "Thursday":
                System.out.printf("It is %s today!%n", day);
                break;
            case "Friday":
                System.out.printf("It is %s today!%n", day);
                break;
            case "Saturday":
                System.out.printf("It is %s today!%n", day);
                break;
            default:
                System.out.println("There's no such day, Broskie!");
        }
    }
}
