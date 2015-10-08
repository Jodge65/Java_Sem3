package fr.iutbay.joey.TP4;

import java.util.HashMap;
import java.util.Map;


public class FeuilleDeCalcul
{
	protected String nom;
	Map<String, Cellule> tableau;
	
	/**
	 * Constructeur de FeuilleDeCalcul
	 * @param name (String) Nom de la feuille
	 * @param tabArg (Map<String, Cellule>) tableau déjà existant
	 */
	public FeuilleDeCalcul(String name)
	{
		this(name, new HashMap<String, Cellule>());
		
	}
	public FeuilleDeCalcul(String name, Map<String, Cellule> tabArg)
	{
		nom = name;
		tableau = tabArg;
	}
	
	// --- FUNCTION ---
	public void addCellule(String key, Cellule value)
	{
		tableau.put(key, value);
	}
	public String toString()
	{
		String affichage = "Feuille de calcul : " + nom + "\n| ";
		
		String lastKey = "A";
		for(String i : tableau.keySet())
		{
			if(!(i.startsWith(""+lastKey)))
			{
				affichage+= "\n| ";
			}
			affichage+= tableau.get(i).getValue() + " | ";
	
		}
		
		return affichage;
	}
	public void afficher()
	{
		System.out.println(toString());
	}
	// --- GET ---
	public String getNom()
	{
		return nom;
	}
	public Map<String, Cellule> getTableau()
	{
		return tableau;
	}
	
	// --- SET ---
	public FeuilleDeCalcul setNom(String nom)
	{
		this.nom = nom;
		return this;
	}
	
	/*public FeuilleDeCalcul setTableau(Map<String, Cellule> tableau)
	{
		this.tableau = tableau;
		return this;
	}*/
}
