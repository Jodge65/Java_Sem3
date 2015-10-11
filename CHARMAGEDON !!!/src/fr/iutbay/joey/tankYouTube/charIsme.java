package fr.iutbay.joey.tankYouTube;

import fr.iutbay.joey.base.ChampDeBatail;
import fr.iutbay.joey.base.CharBase;

/**
 * 
 * @author Matthieu
 *
 */
public class charIsme extends CharBase
{
	/** valeur de dégat bonus (+5 par tour, +30 max)*/
	protected float swag;
	
	public charIsme()
	{
		super();
		nom = "charisme";
		carburant = 258;
		carburantMax = carburant;
		arme = Armes.canon_15;
		swag = 0.0F;
		description = "C'est très charIsmatique tout ça.";
		initiative = 30.0F;
	}
	
	@Override
	public float attaquer(CharBase cible)
	{
		float dommage = super.attaquer(cible);
		if(dommage < 0)
		{
			cible.etreToucher(-swag);
			return dommage - swag;
		}
		else
		{
			cible.etreToucher(swag);
			return dommage + swag;
		}
			
	}
	
	@Override
	public void onUpdate(ChampDeBatail a, ChampDeBatail b)
	{
		if(swag <= 30.0F)
			swag += 5.0F;
		
		super.onUpdate(a,b);
	}
	
}

