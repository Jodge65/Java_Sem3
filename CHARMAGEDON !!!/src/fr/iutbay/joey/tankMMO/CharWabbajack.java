package fr.iutbay.joey.tankMMO;

import java.util.Random;

import fr.iutbay.joey.TP3.CharBouclier;
import fr.iutbay.joey.base.CharBase;

/**
 * 
 * @author Florian
 *
 */
public class CharWabbajack extends CharBase
{
	public CharWabbajack()
	{
		super();
		nom = "Char Wabbajack";
		carburant = 60;
		carburantMax = carburant;
		arme = Armes.canon_0;
		description = "Char qui randomize toutes les caractértistiques";
		initiative = 75.0F;
	}
	
	@Override
	public float attaquer(CharBase cible)
	{
		Random rand = new Random();
		cible.setArme(Armes.getRandomWeapon()).setCarburant(rand.nextInt((int) cible.getCarburant() + 1));
		if(cible instanceof CharBouclier)
		{
			((CharBouclier) cible).setBouclierRestant(rand.nextInt((int) ((CharBouclier) cible).getBouclier()));
		}
		return super.attaquer(cible);
	}
}
