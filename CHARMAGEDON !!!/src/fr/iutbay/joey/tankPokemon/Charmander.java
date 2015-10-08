package fr.iutbay.joey.tankPokemon;

import java.util.Random;

import fr.iutbay.joey.base.ChampDeBatail;
import fr.iutbay.joey.base.CharBase;

/**
 * 
 * @author Matthieu
 *
 */
public class Charmander extends CharBase
{
	public Charmander()
	{
		super();
		nom = "Charmander";
		carburant = 25;
		carburantMax = carburant;
		arme = Armes.canon_1;
		description = "Char peu puissant pouvant infliger brulure";
		initiative = 27.5F;
		
	}
	
	@Override
	public void onUpdate(ChampDeBatail a, ChampDeBatail b)
	{
		nbTourOnFire = 0;
		
		for(int i = 0; i < a.tank.size(); i++)
		{
			if (a.tank.get(i).equals(this))
			{
				if (a.tank.get(i) instanceof Charmander && !(a.tank.get(i) instanceof Charizard))
				{
					a.tank.set(i, new Charmeleon());
				}
			}
		}
		super.onUpdate(a, b);
	}
	
	@Override
	public float attaquer(CharBase cible)
	{
		Random rand = new Random();
			if(rand.nextInt(100) > 50)
			{
				cible.nbTourOnFire = 3;
			}

		return super.attaquer(cible);
	}
}
