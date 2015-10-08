package fr.iutbay.joey.base;

/**
 * 
 * @author Joey
 *
 */
public class FightFunction
{
	public static final float calculerDamage(CharBase attaquant, CharBase cible)
	{
		float degat = attaquant.getArme().getDegat();
		
		return degat;
	}
}
