package fr.iutbay.joey.TP4;

public class Cellule
{
	/** Valeur affiché enregistrer sous forme de Double */
	protected double value;
	
	/**
	 * Constructeur Cellule 
	 * 
	 * @param value (Double) valeur à affiché
	 */
	public Cellule()
	{
		this(0);
	}
	public Cellule(double value)
	{
		this.value = value;
	}

// --- GET --- //
	public double getValue()
	{
		return value;
	}

// --- SET --- //
	public Cellule setValue(double value)
	{
		this.value = value;
		return this;
	}
	
	
}
