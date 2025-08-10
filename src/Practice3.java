import java.util.Scanner;

/**
 * Practice3.java
 *
 * Problem:
 *     Write a program to calculate compound interest given principal, rate, and time.
 *
 * Formula:
 *     A = P(1 + r/n)^(nt)
 *     where:
 *         A = total amount after interest
 *         P = principal amount
 *         r = annual interest rate (in decimal form, e.g., 5% = 0.05)
 *         n = number of times interest is compounded per year
 *         t = time in years
 *
 * Approach:
 *     1. Read principal, time, compounding frequency, and interest rate from user input.
 *     2. Convert the percentage rate to decimal by dividing by 100.
 *     3. Apply the compound interest formula using Math.pow().
 *     4. Display the result formatted to 2 decimal places.
 *
 * Note:
 *     In some locales, Java expects a comma (,) instead of a period (.) for decimal values.
 *     This is why the user is instructed to use commas for input if needed.
 *
 * Difficulty Level: Hard
 *
 * Author: Billy Wellington
 * Date: 2025-08-09
 */
public class Practice3 {
    public static void main(String[] args) {
        int principal, time, num;
        double comp_int, rate;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principal value in $: ");
        principal = scanner.nextInt();

        System.out.println("Enter the time value: ");
        time = scanner.nextInt();

        System.out.println("Enter the number of times the interest is compounded: ");
        num = scanner.nextInt();

        System.out.println("Enter the rate value in percentage. Please use comma (,) instead of period (.): ");
        rate = scanner.nextDouble();
        rate = rate / 100;

        scanner.close();

        comp_int = principal * Math.pow((1 + (rate / num)), num * time);
        System.out.printf("The compound interest is $%.2f", comp_int);
    }
}
