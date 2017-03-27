// client
import java.util.*;

public class Seasons {

    public static void main(String args[]) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Hello! Welcome to Seasons!");
        System.out.println("Which month is your favorite month?");
        int month = userInput.nextInt();
        int season = whichSeason(month);

    }

    public static int whichSeason(int month) {
        // spring: 3, 4, 5; Summer: 6, 7, 8
        // autumn: 9, 10, 11; Winter: 12, 1, 2
    }
}
