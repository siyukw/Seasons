import java.awt.*;

// create object for seasons
// spring: 3, 4, 5; Summer: 6, 7, 8
// autumn: 9, 10, 11; Winter: 12, 1, 2
public class SeasonObject {
    private int season;

    public SeasonObject(int season) {
        DrawingPanel p = new DrawingPanel(1200, 800);
        Graphics g = p.getGraphics();
        this.season = season;
    }




}
