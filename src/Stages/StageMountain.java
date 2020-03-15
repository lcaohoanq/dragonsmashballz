package Stages;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import DBZ.Main;
import Images.GameImages;


public class StageMountain extends Stage{


	
	public StageMountain()
	{
		clouds=new CloudStage(10);
	}
	
	public void paint(Graphics g)
	{
		
		
		g.drawImage(GameImages.maps[13], 0,0,null);
		clouds.paintBackgroundClouds(g);
	}
	

	public String getName() {
		
		return "Mountain";
	}
	
public int getID() {
		
		return 13;
	}
}
