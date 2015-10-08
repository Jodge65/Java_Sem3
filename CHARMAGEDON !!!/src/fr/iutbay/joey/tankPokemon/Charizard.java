package fr.iutbay.joey.tankPokemon;

/**
 * 
 * @author Matthieu
 *
 */
public class Charizard extends Charmander
{
	
	public Charizard()
	{
		super();
		nom = "Charizard";
		carburant = 200;
		carburantMax = carburant;
		arme = Armes.canon_30;
		description = "Char très puissant pouvant infliger brulure";
		initiative = 75.0F;
	}

}
