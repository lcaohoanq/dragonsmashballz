package Stages;


import Images.GameImages;
import java.awt.Graphics;


public class StageCastle extends Stage{


	
	public StageCastle()
	{
		clouds=new CloudStage(10);
		
	}
	
	public void paint(Graphics g)
	{
		
		
		g.drawImage(GameImages.maps[18], 0,0,null);
		clouds.paintBackgroundClouds(g);
	}
	

	public String getName() {
		
		return "Castle";
	}
	
public int getID() {
		
		return 18;
	}
}
