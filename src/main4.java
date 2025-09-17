/**
 * Program Name: main4
 * Description:
 * Author: Billy Wellington
 * Date: 13 September 2025
 * Language: Java
 */

import java.util.Scanner;
public class main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name 1: ");

        String ans1 = scanner.nextLine();

        System.out.println("Enter name 2: ");

        String ans2 = scanner.next();

        System.out.println(ans1 +  " : Length: " + ans1.length());
        System.out.println(ans2 +  " : Length: " + ans2.length());

        int num1 = 20;
        int num2 = 10;

        double num3 = 10;
        double num4 = 10;

//        System.out.printf("%.2f + %.2f = %.2f ", num3, num4, oper(num3, num2));

    }

    static double oper(double valueA, double valueB){
        return valueA + valueB;

    };
}
