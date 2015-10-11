package fr.iutbay.joey.TP4;

import java.util.Map;

public class CelluleFormule extends Cellule
{
	/** formule utilisé pour le calcul */
	protected String formule;
	/** Feuille de calcul (utilisé pour obtenir les valeurs des autres cellule)*/
	protected FeuilleDeCalcul base;

	/**
	 * Constructeur Cellule
	 * 
	 * @param formule (String) formule à calculer puis affiché
	 * @param base (String) feuille de calcul utilisé pour les calculs
	 */
	CelluleFormule(String formule, FeuilleDeCalcul base)
	{
		this.formule = formule;
		this.base = base;
		value = calculerFormule();
	}

	// --- ALL --- //
	/**
	 * 
	 * @return (double) retourne la valeur du résultat calculer
	 */
	private double calculerFormule()
	{
		double resultat = 0;

		String tmp[];
		Map<String, Cellule> temps = base.getTableau();
		if (formule.contains("+"))
		{
			tmp = formule.split("\\+");
			resultat = temps.get(tmp[0]).getValue() + temps.get(tmp[1]).getValue();
		}
		else if (formule.contains("-"))
		{
			tmp = formule.split("\\-");
			resultat = temps.get(tmp[0]).getValue() - temps.get(tmp[1]).getValue();
		}
		else if (formule.contains("*"))
		{
			tmp = formule.split("\\*");
			resultat = temps.get(tmp[0]).getValue() * temps.get(tmp[1]).getValue();
		}
		if (formule.contains("/"))
		{
			tmp = formule.split("\\/");
			resultat = temps.get(tmp[0]).getValue() / temps.get(tmp[1]).getValue();
		}

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
