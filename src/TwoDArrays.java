/**
 *
 */
public class TwoDArrays {
    public static void main(String[] args) {
        String[][] games = new String[2][2];
        games[0][0] = "PUBG";
        games[0][1] = "COD";

        games[1][0] = "Score Match";
        games[1][1] = "Dream League";

        for (int i = 0; i < games.length; i++){
            for (int j = 0; j < games[i].length; j++)
            System.out.println(games[i][j]);
        }

        System.out.println("...");
    }
}
