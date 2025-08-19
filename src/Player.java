import java.util.Random;

/**
 * Represents a PUBG player with statistics such as matches played,
 * matches won, kills, and headshots.
 */
class Player {
    String name;             // Player's name
    int UID;                 // Unique Player ID
    int matchesPlayed;       // Total matches played
    int matchesWon;          // Total matches won
    int totalKills;          // Total kills achieved
    int totalHeadshots;      // Total headshots achieved
    int deaths;              // Calculated as matchesPlayed - matchesWon
    double winRatio;         // Calculated as (matchesWon / matchesPlayed) * 100
    double killDeathRatio;   // Calculated as kills / deaths

    /**
     * Constructs a new Player object with given statistics.
     *
     * @param name        the name of the player
     * @param uid         the unique ID of the player
     * @param mPlayed     number of matches played
     * @param mWon        number of matches won
     * @param tKills      total kills
     * @param tHeadshots  total headshots
     */
    Player(String name, int uid, int mPlayed, int mWon, int tKills, int tHeadshots) {
        this.name = name;
        this.UID = uid;
        this.matchesPlayed = mPlayed;
        this.matchesWon = mWon;
        this.totalKills = tKills;
        this.totalHeadshots = tHeadshots;

        // Calculate deaths (assuming 1 death per lost match)
        this.deaths = mPlayed - mWon;

        // Calculate win ratio (%)
        if (mPlayed > 0) {
            this.winRatio = ((double) mWon / mPlayed) * 100;
        } else {
            this.winRatio = 0.0;
        }

        // Calculate Kill/Death ratio
        if (this.deaths > 0) {
            this.killDeathRatio = (double) tKills / this.deaths;
        } else {
            this.killDeathRatio = tKills; // If no deaths, set K/D as kills
        }
    }

    /**
     * Displays all statistics of the player in a formatted way.
     */
    void displayStats() {
        System.out.println("Player: " + this.name + " (UID: " + this.UID + ")");
        System.out.println("Matches Played: " + this.matchesPlayed);
        System.out.println("Matches Won: " + this.matchesWon);
        System.out.println("Kills: " + this.totalKills + " | Headshots: " + this.totalHeadshots);
        System.out.println("Deaths: " + this.deaths);
        System.out.printf("Win Ratio: %.2f%%\n", this.winRatio);
        System.out.printf("K/D Ratio: %.2f\n", this.killDeathRatio);
        System.out.println("-------------");
    }

    /**
     * Simulates the player participating in a new match,
     * generating random match statistics like kills and damage.
     */
    void playing() {
        Random random = new Random();
        System.out.println(this.name + " is playing PUBG.\nWelcome to PUBG " + this.name);
        System.out.println("This match lasted " + random.nextInt(1, 30) + " minutes.");
        System.out.println("You got: " + random.nextInt(0, 30) + " kills.");
        System.out.println("Damage dealt: " + random.nextInt(0, 2500));
        System.out.println("Assists: " + random.nextInt(0, 10));
        System.out.println("Recalls: " + random.nextInt(0, 3));
        System.out.println("Revives: " + random.nextInt(0, 5));
    }
}
