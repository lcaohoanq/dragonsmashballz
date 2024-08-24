package Stages;


import utils.GameImages;
import java.awt.Color;
import java.awt.Graphics;


public class StageCell extends Stage {

    public StageCell() {
        floor = true;
        clouds = new CloudStage(10);
    }

    public void paint(Graphics g) {
        g.setColor(new Color(83, 255, 204));
        g.fillRect(0, 0, 1000, 600);

        clouds.paintBackgroundClouds(g);

        g.drawImage(GameImages.maps[8], 0, 0, 1000, 600, null);
    }


    public String getName() {

        return "Cell Games";
    }

    public int getID() {

        return 8;
    }
}
