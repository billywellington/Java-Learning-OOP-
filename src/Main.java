/**
 * Main class to run the PUBG Player simulation.
 */
public class Main {
    /**
     * Entry point of the program.
     * Creates Player objects and displays their stats.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Player p1 = new Player("Stellies", 100123, 50, 30, 200, 75);
        Player p2 = new Player("Levinho", 100456, 40, 25, 180, 60);
        Player p3 = new Player("Panda", 100789, 60, 40, 250, 90);

        p1.displayStats();
        p2.displayStats();
        p3.displayStats();

        p1.playing();
        p2.playing();
        p3.playing();
    }
}
