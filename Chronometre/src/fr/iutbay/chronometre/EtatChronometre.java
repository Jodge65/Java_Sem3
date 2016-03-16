package fr.iutbay.chronometre;

import java.io.Serializable;

public class EtatChronometre implements Serializable
{
	private static final long serialVersionUID = 1L;

	protected int[] temps, capture;
	protected boolean modeSeconde;
	
	public EtatChronometre()
	{
		temps = new int[2];
		capture = new int[2];
	}
	
	public EtatChronometre setActualTime(int minutes, int secondes)
	{
		temps[0] = minutes;
		temps[1] = secondes;
		return this;
	}
	
	public EtatChronometre setCaptureTime(int minutes, int secondes)
	{
		capture[0] = minutes;
		capture[1] = secondes;
		return this;
	}
	
	public EtatChronometre setMode(boolean value)
	{
		modeSeconde = value;
		return this;
	}
	
	public EtatChronometre setModeSeconde()
	{
		return setMode(true);
	}
	
	public EtatChronometre setModeCentieme()
	{
		return setMode(false);
	}
	
	public String getActualTime()
	{
		return FenetreChronometre.getValueOf(getActualMinute()) + ":" + FenetreChronometre.getValueOf(getActualSeconde());
	}
	
	public int getActualTime(int index)
	{
		return temps[index];
	}
	
	public int getActualMinute()
	{
		return getActualTime(0);
	}
	
	public int getActualSeconde()
	{
		return getActualTime(1);
	}
	
	public String getCaptureTime()
	{
		return FenetreChronometre.getValueOf(getCaptureMinute()) + ":" + FenetreChronometre.getValueOf(getCaptureSeconde());
	}
	
	public int getCaptureTime(int index)
	{
		return capture[index];
	}
	
	public int getCaptureMinute()
	{
		return getCaptureTime(0);
	}
	
	public int getCaptureSeconde()
	{
		return getCaptureTime(1);
	}
	
	public boolean getModeSeconde()
	{
		return modeSeconde;
	}
	public boolean isOnSeconde()
	{
		return getModeSeconde();
	}
	public boolean isOnCentieme()
	{
		return !getModeSeconde();
	}
}
