package Stages;


import Images.GameImages;
import java.awt.Graphics;


public class StageCityDestroyed extends Stage{

	public StageCityDestroyed()
	{
		
	}
	
	public void paint(Graphics g)
	{	
		g.drawImage(GameImages.maps[1], 0,0, 1000, 600,null);
	}


	public String getName() {
		
		return "Destroyed City";
	}

	
	public int getID() {
		
		return 3;
	}
	
}
