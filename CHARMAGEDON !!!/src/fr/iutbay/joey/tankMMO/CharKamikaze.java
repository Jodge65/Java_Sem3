package fr.iutbay.joey.tankMMO;

import fr.iutbay.joey.base.CharBase;
import fr.iutbay.joey.base.FightFunction;

/**
 * 
 * @author Florian
 *
 */
public class CharKamikaze extends CharBase
{
	public CharKamikaze()
	{
		super();
		nom = "Char Kamikaze";
		carburant = 25;
		carburantMax = carburant;
		arme = Armes.canon_100;
		description = "Char bourré d'explosif !!!";
		initiative = 25.0F;
	}
	
	@Override
	public float attaquer(CharBase cible)
	{
		float dommage = super.attaquer(cible);
		this.etreToucher(FightFunction.calculerDamage(this, cible));
		return dommage;
	}
}
