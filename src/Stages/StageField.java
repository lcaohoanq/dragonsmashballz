package Stages;


import Images.GameImages;
import java.awt.Color;
import java.awt.Graphics;


public class StageField extends Stage{


	
	public StageField()
	{
		clouds=new CloudStage(10);
	}
	
	public void paint(Graphics g)
	{
		g.setColor(new Color(150,150,250));
		g.fillRect( 0,0, 1000, 600);
		
		
		
		g.drawImage(GameImages.maps[14], 0,0, 1000, 600,null);
		clouds.paintBackgroundClouds(g);
	}
	

	public String getName() {
		
		return "Field";
	}
	
public int getID() {
		
		return 14;
	}
}
