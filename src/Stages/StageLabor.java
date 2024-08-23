package Stages;

import Images.GameImages;
import java.awt.Graphics;

public class StageLabor extends Stage {

	public StageLabor()
	{
		floor=false;
	}
	
	public void paint(Graphics g)
	{	
		g.drawImage(GameImages.maps[12], 0,0, 1000, 600,null);
	}
	

	public String getName() {
		
		return "Geros Laboratory";
	}
	
public int getID() {
		
		return 12;
	}
	
}
