package Stages;

import utils.GameImages;
import java.awt.Dimension;
import java.awt.Graphics;


public class CloudStage {

    private final Cloud[] clouds;
    private int background;
    private int foreground;

    public CloudStage(int wolken) {
        clouds = new Cloud[wolken];
        for (int i = 0; i < wolken; i++) {
            clouds[i] = new Cloud();
        }
        background = wolken;
    }

    public void setForeground(int fore) {
        foreground = fore;
        background -= fore;
    }


    public void paintBackgroundClouds(Graphics g) {
        for (int i = 0; i < background; i++) {
            paintCloud(g, i);
        }
    }

    public void paintForegroundClouds(Graphics g) {
        for (int i = background; i < foreground + background; i++) {
            paintCloud(g, i);
        }
    }


    private void paintCloud(Graphics g, int i) {
        clouds[i].move();
        int x = clouds[i].getX();
        int y = clouds[i].getY();
        int id = clouds[i].getID();
        Dimension dim = clouds[i].getDimension();
        if (clouds[i].getLeft()) {
            g.drawImage(GameImages.clouds[id], x, y, dim.width, dim.height, null);
        } else {
            g.drawImage(GameImages.clouds[id], (x + dim.width), y, -dim.width,
                dim.height, null);
        }
    }

    public void moveClouds(int x, int y) {
        for (int i = 0; i < clouds.length; i++) {
            clouds[i].move(x, y);
        }
    }
}
