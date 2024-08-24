package Stages;


import utils.GameImages;
import java.awt.Graphics;


public class StageKame extends Stage{

	public StageKame()
	{
		
	}
	
	public void paint(Graphics g)
	{	
		g.drawImage(GameImages.maps[3], 0,0, 1000, 600,null);
	}
	

	public String getName() {
		
		return "Kame House";
	}
	
public int getID() {
		
		return 2;
	}
}
