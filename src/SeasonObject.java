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
            oColor = new Color(79, 180, 43);
        } else if (season == 2) {
            sColor = new Color(22, 100, 31);
            oColor = new Color(3, 70, 4);
        } else if (season == 3) {
            sColor = new Color(158, 58, 8);
            oColor = new Color(180, 124, 11);
        } else {
            sColor = new Color(168, 220, 226);
            oColor = new Color(211, 255, 241);
        }
        p.setBackground(new Color(118, 184, 200));
        g.setColor(new Color(158, 8, 17));
        g.fillOval(50, 50, 70, 70);
        g.setColor(sColor);
        g.fillRect(0, 600, 1200, 200);
        tree(50, 500, 100);
        tree(850, 330, 250);
        tree(1000, 400, 170);
        tree(500, 200, 350);
        tree(300, 300, 300);
        tree(750, 450, 150);
        tree(800, 400, 220);
        
        // if winter, snowflakes
        if(season == 4) {
            snowFlake(200, 300, 50);
        }
    }

    private void tree(int x, int y, int size) {
        g.setColor(oColor);
        g.fillOval(x, y, size, size);
        g.setColor(new Color(56, 18, 0));
        g.fillRect(x + size / 3, y + 2 * size / 3, size / 3, size * 2 / 3);
        g.fillRect(x + size / 3, y + size / 3, size / 9, size);
        g.fillRect(x + 5 * size / 9, y + size / 3, size / 9, size);
    }

    private void snowFlake(int x, int y, int size) {
        g.setColor(Color.WHITE);
        // finish snowflakes
    }




}
