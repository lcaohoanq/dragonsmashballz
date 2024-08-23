package Controlls;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;




public class Keys implements KeyListener{
	
	
	private final boolean[] tastendruck=new boolean[1000];
	

	
	private final int[] cheatcounter={0,0,0,0};
	private final String[] cheatstring={"helpmegoku","thxvegeta","capsulecorp","itsover9000"};
	private int cheat=0;
	private int lastkey=-1;
	
	public Keys()
	{		 
		
	}

	
	public boolean[] getPressedKeys()
	{
		return tastendruck;
	}
	
	public boolean isKeyPressed(int nr)
	{
		return tastendruck[nr];
	}

	
	
	public void takt()
	{
		
	}
	
	public void keyPressed(KeyEvent k) {
		//Wird aufgerufen wenn eine Taste gedr�ckt wird
	
			tastendruck[k.getKeyCode()]=true;
	}
	

	public int getLastKey()
	{
		int l=lastkey;
		lastkey=-1;
		return l;
	}

	public static int pressedkey=-1;
	private final int number=0;
	public void keyReleased(KeyEvent k) {
		//Wird aufgerufen wenn eine Taste losgelassen wird
		tastendruck[k.getKeyCode()]=false;
		
		  pressedkey=k.getKeyCode();
		  lastkey=k.getKeyCode();
		 char taste= k.getKeyChar();
		for(int i=0; i<cheatstring.length; i++)
		{
       if( String.valueOf( taste).equals(String.valueOf( cheatstring[i].charAt(cheatcounter[i])) )){
    	   cheatcounter[i]++;
    	   if(cheatcounter[i]==cheatstring[i].length())
    	   {


    		   cheat=i+1;
    		   cheatcounter[i]=0;
    	   }
       }
       else
       {
    	   cheatcounter[i]=0;
       }	
		}
	}

	public int activateCheat(){
		
		int b=cheat;
		cheat=0;
		return b;
	}
	

	public void keyTyped(KeyEvent k) {
		//Wird aufgerufen wenn eine Taste gedr�ckt und danach losgelassen wird
		
	}		
}
