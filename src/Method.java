/**
 * Program: Simple Methods Demonstration
 *
 * Description:
 * This program demonstrates how to define and use methods in Java.
 * It includes:
 *  - A method with no parameters and no return value (`hello()`).
 *  - A method with parameters and a return value (`add(int a, int b)`).
 *
 * Learning Objectives:
 *  - Understand how to declare static methods in Java.
 *  - Practice passing arguments to methods.
 *  - Learn how to return values from methods.
 *
 * Features:
 *  - Calls the `hello()` method to print a greeting message.
 *  - Calls the `add()` method to add two integers and return the result.
 *  - Demonstrates method overloading concepts (can be expanded further).
 *
 * Author: Billy Wellington
 * Date: 18 August 2025
 */

public class Method {
    public static void main(String[] args) {
        hello();
        int x = 3, y = 6;

        System.out.println(add(x, y));

        System.out.println("...");
    }

    static void hello(){
        System.out.println("Hello Bro!");
    }

    static int add(int a, int b){
        return a + b;
    }
}
