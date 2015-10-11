package fr.iutbay.joey.interfaceTank;

import fr.iutbay.joey.base.ChampDeBatail;
import fr.iutbay.joey.base.CharBase;

/**
 * 
 * @author Joey
 *
 */
public interface CharFunction
{
	/**
	 * 
	 * @param cible (CharBase) cible touché par l'attaque
	 * @return (float) les dégats qui ont été infligé (avant passage sur êtreToucher
	 */
	public float attaquer(CharBase cible);
	
	/**
	 * 
	 * @param value (float) montant de dégat à infligé
	 * @return (boolean) return true si la cible a été touché, false sinon
	 */
	public boolean etreToucher(float value);
	
	/**
	 * Rend le char "mort" (inactif)
	 */
	public void setDead();
	
	/**
	 * 
	 * @return (boolean) returne true si le char est mort, false sinon
	 */
	public boolean isDead();
	
	/**
	 * Action réalisé à chaque fin de tour
	 * @param a (champDeBatail) champ de l'attaquant 
	 * @param b (champDeBatail) champ du défenceurs
	 */
	public void onUpdate(ChampDeBatail a, ChampDeBatail b);

}
