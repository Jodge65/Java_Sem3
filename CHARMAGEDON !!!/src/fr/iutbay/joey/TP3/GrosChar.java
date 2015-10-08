package fr.iutbay.joey.TP3;

/**
 * 
 * @author Joey
 *
 */
public class GrosChar extends CharBouclier
{
	public GrosChar()
	{
		super();
		nom = "Gros char";
		bouclier = 1;
		carburant = 200;
		carburantMax = carburant;
		arme = Armes.canon_1;
		bouclierRestant = bouclier;
		description = "Char ayant 3 boucliers fixes";
		initiative= 200.0F;
	}
}
