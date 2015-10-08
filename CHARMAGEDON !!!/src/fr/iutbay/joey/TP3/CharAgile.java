package fr.iutbay.joey.TP3;

import java.util.Random;

import fr.iutbay.joey.base.CharBase;
import fr.iutbay.joey.interfaceTank.CharEsquive;

/**
 * 
 * @author Joey
 *
 */
public class CharAgile extends CharBase implements CharEsquive
{
	protected float chanceCritique;
	
	public CharAgile()
	{
		super();
		chanceCritique = 20.0F;
		nom = "Char Agile";
		description = "Char ayant 20% de chance d'esquiver";
	}
	
	@Override
	public boolean esquive()
	{
		Random rand = new Random();
		if(rand.nextInt(100) > chanceCritique)		
			return false;
		else
			return true;
	}
	
	

}
