package fr.iutbay.joey.tankPokemon;

import fr.iutbay.joey.base.ChampDeBatail;

/**
 * 
 * @author Matthieu
 *
 */
public class Charmeleon extends Charmander
{
	public Charmeleon()
	{
		super();
		nom = "Charmeleon";
		carburant = 75;
		carburantMax = carburant;
		arme = Armes.canon_10;
		description = "Char assez puissant pouvant infliger brulure";
		initiative = 50.0F;
	}
	
	@Override
	public void onUpdate(ChampDeBatail a, ChampDeBatail b)
	{	
		for(int i = 0; i < a.tank.size(); i++)
		{
			if (a.tank.get(i).equals(this))
			{
				if(a.tank.get(i) instanceof Charmeleon && !(a.tank.get(i) instanceof Charizard))
				{
					a.tank.set(i, new Charizard());
				}
			}
		}
		super.onUpdate(a, b);
	}
}

