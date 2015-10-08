package fr.iutbay.joey.tankMMO;

import fr.iutbay.joey.base.CharBase;

/**
 *
 * @author Florian
 *
 */
public class CharDK extends CharBase
{
	public CharDK()
	{
		super();
		nom = "charDK";
		description = "Char ayant du vol de vie";
	}

	@Override
	public float attaquer(CharBase cible)
	{
		float dommage = super.attaquer(cible);
		carburant += dommage;
		if (carburant>carburantMax)
		{
			carburant = carburantMax;
		}
		return dommage;

	}
}
