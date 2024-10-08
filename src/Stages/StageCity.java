package Stages;


import utils.GameImages;
import java.awt.Color;
import java.awt.Graphics;


public class StageCity extends Stage {


    public StageCity() {
        clouds = new CloudStage(10);
        clouds.setForeground(10);
        floor = false;
    }

    public void paint(Graphics g) {
        g.setColor(new Color(26, 152, 216));
        g.fillRect(0, 0, 1000, 600);

        g.drawImage(GameImages.maps[10], 0, 0, 1000, 600, null);

        clouds.paintForegroundClouds(g);
    }


    public String getName() {
        return "Capital City";
    }

    public int getID() {
        return 10;
    }
}
