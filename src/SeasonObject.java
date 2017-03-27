import java.awt.*;

// create object for seasons
public class SeasonObject {
    private int season;

    public SeasonObject(int season) {
        DrawingPanel p = new DrawingPanel(1200, 800);
        Graphics g = p.getGraphics();
        this.season = season;
    }


}
