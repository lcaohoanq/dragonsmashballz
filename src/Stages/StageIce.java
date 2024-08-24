package Stages;


import utils.GameImages;
import java.awt.Graphics;


public class StageIce extends Stage {


    public StageIce() {
        clouds = new CloudStage(10);
    }

    public void paint(Graphics g) {

        g.drawImage(GameImages.maps[15], 0, 0, null);
        clouds.paintBackgroundClouds(g);
    }


    public String getName() {

        return "Icefield";
    }

    public int getID() {

        return 15;
    }
}
