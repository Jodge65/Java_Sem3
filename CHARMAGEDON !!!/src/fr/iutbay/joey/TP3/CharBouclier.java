package fr.iutbay.joey.TP3;

import fr.iutbay.joey.base.CharBase;

/**
 * 
 * @author Joey
 *
 */
public class CharBouclier extends CharBase
{
	protected int bouclier;
	protected int bouclierRestant;
	
	public CharBouclier()
	{
		super();
		nom = "Char Bouclier";
		bouclier = 3;
		bouclierRestant = bouclier;
		description = "Char ayant 3 boucliers fixes";
		initiative = 75.0F; 
	}
	
// --- SET --- //
	/**
	 * Ne peut pas être supérieur a bouclier
	 * @param value (int) nombre de bouclier restant
	 * @return (CharBase) retourne lui même
	 */
	public CharBouclier setBouclierRestant(int value)
	{
		if (value > bouclier)
			value = bouclier;
		
		bouclierRestant = value;
		return this;
	}
	
	/**
	 * Ne peut pas être supérieur a bouclier
	 * @param value (int) nombre de bouclier max
	 * @return (CharBase) retourne lui même
	 */
	public CharBouclier setBouclier(int value)
	{
		bouclier = value;
		return this;
	}

	
// --- SET --- //
	public int getBouclier()
	{
		return bouclier;
	}
	
	public int getBouclierRestant()
	{
		return bouclierRestant;
	}
	
// --- ALL --- //
	@Override
	public boolean etreToucher(float value)
	{
		if(bouclierRestant > 0)
		{
			bouclierRestant--;
			return false;
		}
		else
		{
			super.etreToucher(value);
			return true;
		}
	}


}
