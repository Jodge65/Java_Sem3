package fr.iutbay.joey.interfaceTank;

import fr.iutbay.joey.base.ChampDeBatail;
import fr.iutbay.joey.base.CharBase;

/**
 * 
 * @author Joey
 *
 */
public interface CharFunction
{
	public float attaquer(CharBase cible);
	
	public boolean etreToucher(float value);
	
	public void setDead();
	
	public boolean isDead();
	
	public void onUpdate(ChampDeBatail a, ChampDeBatail b);

}
