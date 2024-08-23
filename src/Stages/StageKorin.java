package Stages;


import Images.GameImages;
import java.awt.Graphics;


public class StageKorin extends Stage{


	
	public StageKorin()
	{
		clouds=new CloudStage(10);
		
	}
	
	public void paint(Graphics g)
	{
		
		g.drawImage(GameImages.maps[21], 0,0,null);
		clouds.paintBackgroundClouds(g);
	}
	

	public String getName() {
		
		return "Korin";
	}
	
public int getID() {
		
		return 21;
	}
}
