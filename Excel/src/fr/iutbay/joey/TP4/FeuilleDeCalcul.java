package fr.iutbay.joey.TP4;

import java.util.HashMap;
import java.util.Map;


public class FeuilleDeCalcul
{
	/** Nom de la feuille de calcul */
	protected String nom;
	/** intégralité des case du tableau */
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
	
	// --- ALL --- //
	/**
	 * 
	 * @param key (String) ID de la celulle
	 * @param value (Cellule) cellule a introduire a cette place
	 */
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
	/**
	 * affiche la cellule (utilisé la formule toString())
	 */
	public void afficher()
	{
		System.out.println(toString());
	}
	// --- GET --- //
	public String getNom()
	{
		return nom;
	}
	public Map<String, Cellule> getTableau()
	{
		return tableau;
	}
	
	// --- SET --- //
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
