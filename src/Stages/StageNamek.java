package Stages;


import Images.GameImages;
import java.awt.Graphics;


public class StageNamek extends Stage{

	public StageNamek()
	{
		
	}
	
	public void paint(Graphics g)
	{	
		g.drawImage(GameImages.maps[2], 0,0, 1000, 600,null);
	}
	

	public String getName() {
		
		return "Namek";
	}
	
public int getID() {
		
		return 1;
	}
}
