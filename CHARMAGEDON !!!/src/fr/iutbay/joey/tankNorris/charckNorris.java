package fr.iutbay.joey.tankNorris;

import fr.iutbay.joey.base.CharBase;
/**
 * 
 * @author Matthieu
 *
 */
public class charckNorris extends CharBase
{
	
	public charckNorris()
	{
		super();
		nom = "charckNorris";
		carburant = Float.MAX_VALUE;
		carburantMax = carburant;
		arme = Armes.canon_Infini;
		description = "charckNorris peut encercler ses ennemis. Tout seul.";
		initiative = 0.0F;
	}
}
