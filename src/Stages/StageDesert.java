package Stages;


import utils.GameImages;
import java.awt.Graphics;


public class StageDesert extends Stage {


    public StageDesert() {
        clouds = new CloudStage(10);
    }

    public void paint(Graphics g) {
        g.drawImage(GameImages.maps[20], 0, 0, null);
        clouds.paintBackgroundClouds(g);
    }


    public String getName() {
        return "Desert";
    }

    public int getID() {
        return 20;
    }
}
