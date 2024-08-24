package Stages;


import utils.GameImages;
import java.awt.Graphics;


public class StageMountain extends Stage {


    public StageMountain() {
        clouds = new CloudStage(10);
    }

    public void paint(Graphics g) {

        g.drawImage(GameImages.maps[13], 0, 0, null);
        clouds.paintBackgroundClouds(g);
    }


    public String getName() {

        return "Mountain";
    }

    public int getID() {

        return 13;
    }
}
