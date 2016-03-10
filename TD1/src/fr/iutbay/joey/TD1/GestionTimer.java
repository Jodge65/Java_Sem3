package fr.iutbay.joey.TD1;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class GestionTimer extends Thread
{
	public long duration;
	public JProgressBar bar;
	public JFrame fenetre;
	
	GestionTimer(long duration, JProgressBar bar, JFrame fenetre)
	{
		this.duration = duration * 1000;
		this.bar = bar;
		this.fenetre = fenetre;
	}
	
	public synchronized void run()
	{
		while((bar.getValue() < bar.getMaximum()))
		{
			try{sleep(duration / 100);}
			catch (InterruptedException e){}
			
			bar.setValue(bar.getValue() + 1);
		}
		if(bar.getValue() == bar.getMaximum())
			fenetre.dispose();
		
	}
	
}
