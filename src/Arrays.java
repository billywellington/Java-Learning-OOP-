/**
 * The Arrays class demonstrates two different methods of creating
 * and displaying string arrays in Java.
 *
 * <p>
 * Method 1: Creates a String array with a fixed size and assigns values manually. <br>
 * Method 2: Initializes a String array directly with predefined values.
 * </p>
 *
 * <p>
 * The program outputs the list of games from both arrays to the console.
 * </p>
 *
 * @author  Billy Wellington
 * @version 1.0
 * @since   2025-08-15
 */
public class Arrays {

    /**
     * The main method is the entry point of the program.
     * It demonstrates two different ways of working with String arrays:
     * <ul>
     *     <li>Creating an empty array and assigning values individually.</li>
     *     <li>Creating and initializing the array directly with values.</li>
     * </ul>
     *
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {

        // -----------------------
        // Method 1: Manual assignment
        // -----------------------
        String[] games = new String[3]; // Create an array of size 3
        games[0] = "PUBG";
        games[1] = "COD";
        games[2] = "Freefire";

        // Print the array contents
        for (int i = 0; i < games.length; i++) {
            System.out.printf(games[i]);
            System.out.println("");
        }

        // -----------------------
        // Method 2: Direct initialization
        // -----------------------
        String[] fps_games = {"PUBG", "COD", "FreeFire"};
        System.out.println("List of popular FPS Games: ");

        // Print the array contents
        for (int i = 0; i < fps_games.length; i++) {
            System.out.printf(fps_games[i]);
            System.out.println("");
        }
    }
}
