package Stages;


import Images.GameImages;
import java.awt.Graphics;


public class StageNamekDestroyed extends Stage{

	public StageNamekDestroyed()
	{
		floor=true;
	}
	
	public void paint(Graphics g)
	{	
		g.drawImage(GameImages.maps[11], 0,0, 1000, 600,null);
	}
	

	public String getName() {
		
		return "Dying Namek";
	}
	
public int getID() {
		
		return 11;
	}
}
