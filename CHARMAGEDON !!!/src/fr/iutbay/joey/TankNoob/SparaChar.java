package fr.iutbay.joey.TankNoob;

import java.util.Random;

import fr.iutbay.joey.base.CharBase;
import fr.iutbay.joey.base.FightFunction;

/**
 * 
 * @author Florian
 *
 */
public class SparaChar extends CharBase
{
	public SparaChar()
	{
		super();
		nom = "SparaChar";
		carburant = 125;
		carburantMax = carburant;
		arme = Armes.canon_N15;
		description = "Char noob ! 1/2 de soigner l'enemie...";
		initiative = 14.5F;
	}
	
	@Override
	public float attaquer(CharBase cible)
	{
		float dommage = FightFunction.calculerDamage(this, cible);
		Random rand = new Random();
		if(rand.nextInt(100) >= 50)
			dommage*=-1;
		cible.etreToucher(dommage);
		return dommage;
	}
}
