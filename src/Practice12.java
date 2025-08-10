/**
 * Practice12.java
 *
 * Problem:
 *     Create a program that simulates rolling two dice and prints their values and sum.
 *
 * Approach:
 *     1. Ask the user to type "Yes" to start the game.
 *     2. For six consecutive rolls:
 *         - Generate random values between 1 and 6 for two dice.
 *         - Print each die value.
 *     3. Display a goodbye message after all rolls are complete.
 *
 * Tools Used:
 *     - java.util.Random for random dice rolls.
 *     - java.util.Scanner for user input.
 *
 * Level: Easy
 *
 * Author: Billy Wellington
 * Date: 2025-08-10
 */

import java.util.Scanner;

import java.util.Random;


public class Practice12 {
    public static void main(String[] args) {
        System.out.println("Welcome to the Rolling Dice Game");
        System.out.println("Type Yes to Start");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num;

        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("yes")){
            System.out.println("Dice Game has started");
            System.out.println("Rolling Dices....");

            System.out.println("Roll 1:");
            num = random.nextInt(6) +1;
            System.out.println("Dice 1: " + num);
            num = random.nextInt(6) +1;
            System.out.println("Dice 2: " + num);


            System.out.println("\nRoll 2:");
            num = random.nextInt(6) +1;
            System.out.println("Dice 1: " + num);
            num = random.nextInt(6) +1;
            System.out.printf("Dice 2: %d%n", num);

            System.out.println("Roll 3:");
            num = random.nextInt(6) +1;
            System.out.println("Dice 1: " + num);
            num = random.nextInt(6) +1;
            System.out.printf("Dice 2: %d%n", num);

            System.out.println("Roll 4:");
            num = random.nextInt(6) +1;
            System.out.println("Dice 1: " + num);
            num = random.nextInt(6) +1;
            System.out.printf("Dice 2: %d%n", num);

            System.out.println("Roll 5:");
            num = random.nextInt(6) +1;
            System.out.println("Dice 1: " + num);
            num = random.nextInt(6) +1;
            System.out.printf("Dice 2: %d%n", num);

            System.out.println("Roll 6:");
            num = random.nextInt(6) +1;
            System.out.println("Dice 1: " + num);
            num = random.nextInt(6) +1;
            System.out.printf("Dice 2: %d%n", num);





            System.out.println("Thank you for playing the Dice Game....");
            System.out.println("Goodbye!!");




        }

    }
}
