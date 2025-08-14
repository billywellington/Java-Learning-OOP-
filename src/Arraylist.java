/**
 * Program Name: ArrayList Example
 *
 * Description:
 * This program demonstrates the basic operations of Java's ArrayList class
 * using a list of game names as an example. The following ArrayList operations
 * are showcased:
 *  - Adding elements to the list.
 *  - Updating (modifying) an existing element.
 *  - Inserting an element at the beginning.
 *  - Removing an element by index.
 *  - Clearing all elements from the list.
 *  - Checking if the list is empty.
 *
 * Note:
 * The program uses loops to display the contents of the list at various stages
 * of modification so you can see the effect of each operation.
 *
 * Author: Billy Wellington
 * Date: 15 August 2025
 * Language: Java
 */
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> games = new ArrayList<String>();

        games.add("PUBG");
        games.add("FIFA");
        games.add("COD");

        for (int i = 0; i < 3; i++){
            System.out.println(games.get(i));
        }

        games.set(1, "Free Fire");
        games.add(0, "BGMI"); // Changed addFirst to add(index, element)
        System.out.println();

        for (int i = 0; i < games.size(); i++){
            System.out.println(games.get(i));
        }
        System.out.println();

        games.remove(2);
        for (int i = 0; i < games.size(); i++){
            System.out.println(games.get(i));
        }

        System.out.println();

        games.clear();
        for (int i = 0; i < games.size(); i++){
            System.out.println(games.get(i));
        }

        boolean ans = games.isEmpty();
        if (ans){
            System.out.println("It is " + ans + " that the arraylist has been cleared");
        }
    }
}
