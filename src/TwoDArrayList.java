/**
 * Program: World Continents and Countries using 2D ArrayLists
 *
 * Description:
 * This program demonstrates how to use a 2D ArrayList (an ArrayList of ArrayLists) in Java.
 * It creates ArrayLists for different continents, each containing a list of countries.
 * These continent lists are then stored in a larger "world" ArrayList.
 *
 * Learning Objectives:
 *  - Understand how to create and initialize ArrayLists in Java.
 *  - Learn how to store ArrayLists inside another ArrayList (2D ArrayLists).
 *  - Practice accessing elements using the get(index) method.
 *  - Explore how ArrayLists are printed using their default toString() method.
 *
 * Features:
 *  - Creates continent-level ArrayLists (Europe, Africa, America, Asia).
 *  - Stores them inside a master ArrayList called "world".
 *  - Demonstrates printing the entire structure, a single continent, or a single country.
 *  - Shows how to access nested elements using indices.
 *
 * Author: Billy Wellington
 * Date: 18 August 2025
 */

import java.util.*;

public class TwoDArrayList {
    public static void main(String[] args) {
        ArrayList<String> africa = new ArrayList<>();

        africa.add("South Africa");
        africa.add("Zimbabwe");
        africa.add("Zambia");
        africa.add("Niger");
        africa.add("Mali");

        ArrayList<String> asia = new ArrayList<>();

        asia.add("South Korea");
        asia.add("Japan");
        asia.add("China");
        asia.add("India");
        asia.add("Sri Lanka");

        ArrayList<String> europe = new ArrayList<>();

        europe.add("England");
        europe.add("Wales");
        europe.add("France");
        europe.add("Italy");
        europe.add("Spain");

        ArrayList<String> america = new ArrayList<>();

        america.add("USA");
        america.add("Canada");
        america.add("Mexico");
        america.add("Argentina");
        america.add("Chile");

        ArrayList<ArrayList<String>> world = new ArrayList<>();

        world.add(europe);
        world.add(africa);
        world.add(america);
        world.add(asia);

        System.out.println(world);
        System.out.println(africa);
        System.out.println(asia);
        System.out.println(europe);

        System.out.println(world.get(0));
        System.out.println(world.get(0).get(1));
        System.out.println(africa.get(1));
        System.out.println(asia.get(2));
        System.out.println(america.get(3));
        System.out.println(europe.get(4));








    }
}
