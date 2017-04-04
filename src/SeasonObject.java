import java.awt.*;

// create object for seasons
// spring: 1; Summer: 2
// autumn: 3; Winter: 4
public class SeasonObject {
    private int season;
    private Color sColor;
    private Color oColor;
    private Graphics g;

    public SeasonObject(int season) {
        DrawingPanel p = new DrawingPanel(1200, 800);
        g = p.getGraphics();
        this.season = season;
        if (season == 1) {
            sColor = new Color(139, 180, 40);
            oColor = new Color(139, 180, 40);
        } else if (season == 2) {
            sColor = new Color(22, 100, 31);
        } else if (season == 3) {
            sColor = new Color(158, 84, 34);
        } else {
            sColor = new Color(168, 220, 226);
        }
        p.setBackground(new Color(118, 184, 200));
        g.setColor(new Color(158, 8, 17));
        g.fillOval(50, 50, 70, 70);
        g.setColor(sColor);
        g.fillRect(0, 600, 1200, 200);
        tree()
    }

    private void tree(int x, int y, int size, Color c) {
        g.setColor(c);
        g.fillOval(x, y, size, size);
        g.setColor(new Color(56, 18, 0));
        g.fillRect(x + size / 3, y + 2 * size / 3, size / 3, size);
        g.fillRect(x + size / 3, y + size / 3, size / 9, size/3);
        g.fillRect(x + 2 * size / 3, y + size / 3, size / 9, size/3);
    }




}
