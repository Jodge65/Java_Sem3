package fr.iutbay.joey.TP4;

import java.util.Map;

public class CelluleFormule extends Cellule
{
	/** formule utilisé pour le calcul */
	protected String formule;
	protected FeuilleDeCalcul base;
	


	/**
	 * Constructeur Cellule 
	 * 
	 * @param formule (String) formule à calculer puis affiché
	 * @param base (String) feuille de calcul utilisé pour les calculs
	 */
	CelluleFormule (String formule, FeuilleDeCalcul base)
	{
		this.formule = formule;
		this.base = base;
		value = calculerFormule();
	}

	// --- FUNCTION ---
	private double calculerFormule()
	{
		double resultat = 0;
		
		String a = formule.substring(0, 2);
		String function = formule.substring(2, 3);
		String b = formule.substring(3, 5);

		Map<String, Cellule> temps = base.getTableau();
		if(temps.containsKey(a) && temps.containsKey(b))
			if(function.equalsIgnoreCase("+"))
				resultat = temps.get(a).getValue() + temps.get(b).getValue();
			else if (function.equalsIgnoreCase("-"))
				resultat = temps.get(a).getValue() - temps.get(b).getValue();
			else if (function.equalsIgnoreCase("*"))
				resultat = temps.get(a).getValue() * temps.get(b).getValue();
			else if (function.equalsIgnoreCase("/"))
				resultat = temps.get(a).getValue() / temps.get(b).getValue();

		value = resultat;
		return resultat;
	}

	// --- GET ---
	public String getFormule()
	{
		return formule;
	}
	
	public FeuilleDeCalcul getBase()
	{
		return base;
	}

	// --- SET ---
	public CelluleFormule setFormule(String formule)
	{
		this.formule = formule;
		return this;
	}
	public CelluleFormule setBase(FeuilleDeCalcul base)
	{
		this.base = base;
		return this;
	}
}
