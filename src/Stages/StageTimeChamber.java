package Stages;


import Images.GameImages;
import java.awt.Graphics;


public class StageTimeChamber extends Stage{

	public StageTimeChamber()
	{
		
	}
	
	public void paint(Graphics g)
	{	
		g.drawImage(GameImages.maps[6], 0,0,null);		
	}


	public String getName() {
		
		return "Time Chamber";
	}

	
	public int getID() {
		
		return 5;
	}
	
}
