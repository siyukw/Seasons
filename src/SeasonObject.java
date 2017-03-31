import java.awt.*;

// create object for seasons
// spring: 1; Summer: 2
// autumn: 3; Winter: 4
public class SeasonObject {
    private int season;
    private Color sColor;

    public SeasonObject(int season) {
        DrawingPanel p = new DrawingPanel(1200, 800);
        Graphics g = p.getGraphics();
        this.season = season;
        if (season == 1) {
            sColor = new Color(125, 180, 36);
        } else if (season == 2) {
            sColor = new Color(22, 100, 31);
        } else if (season == 3) {
            sColor = new Color(158, 84, 34);
        } else {
            sColor = Color.white;
        }
    }




}
