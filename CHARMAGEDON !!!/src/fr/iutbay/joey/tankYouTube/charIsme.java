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
		cible.etreToucher(swag);
		return dommage + swag;
	}
	
	@Override
	public void onUpdate(ChampDeBatail a, ChampDeBatail b)
	{
		if(swag <= 30.0F)
			swag += 5.0F;
		
		super.onUpdate(a,b);
	}
	
}

