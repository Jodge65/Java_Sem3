package fr.iutbay.joey.TD1;

import java.io.Serializable;

public class Requete implements Serializable
{
	private static final long serialVersionUID = 1L;

	public String codeAeroport;
	public boolean isMeter;
	
	public Requete(String codeAeroport)
	{
		this(codeAeroport, true);
	}
	public Requete(String codeAeroport, Boolean isMeter)
	{
		this.codeAeroport = codeAeroport;
		this.isMeter = isMeter;
	}

	public boolean isInMeter()
	{
		return isMeter;
	}
	public boolean isInFoot()
	{
		return !isMeter;
	}
}
