// client
import java.util.*;

public class Seasons {

    public static void main(String args[]) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Hello! Welcome to Seasons!");
        System.out.println("Which month is your favorite month?");
        int month = userInput.nextInt();
        int season = whichSeason(month);
        SeasonObject s = new SeasonObject(season);
    }

    public static int whichSeason(int month) {
        // spring: 3, 4, 5; Summer: 6, 7, 8
        // autumn: 9, 10, 11; Winter: 12, 1, 2
        if(month == 12 || month == 1 || month == 2) {
            return 4;
        } else if(month > 2 && month < 6) {
            return 1;
        } else if(month > 5 && month < 9) {
            return 2;
        } else if(month >8 && month < 12) {
            return 3;
        } else {
            System.out.println("You are too stupid to use this sorry bye.");
            return 0;
        }
    }
}
