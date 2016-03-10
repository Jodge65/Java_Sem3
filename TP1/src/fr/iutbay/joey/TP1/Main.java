package fr.iutbay.joey.TP1;

public class Main
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		FenetreImage f = new FenetreImage("img/test.png");
		try{Thread.sleep(2000);}
		catch (InterruptedException e){}
		f.setImage("img/play.png");
		try{Thread.sleep(2000);}
		catch (InterruptedException e){}
/*		f.setImage("img/pause.png");
		try{Thread.sleep(2000);}
		catch (InterruptedException e){}
		f.setImage("img/stop.png");
		try{Thread.sleep(2000);}
		catch (InterruptedException e){}*/
		f.dispose();
		
		
		FenetreTexteRelief f2 = new FenetreTexteRelief("Testont cette suite de CHARactère ultra longue :D");
		
	}
}
