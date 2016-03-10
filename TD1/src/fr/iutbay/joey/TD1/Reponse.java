package fr.iutbay.joey.TD1;

import java.io.Serializable;

public class Reponse implements Serializable
{
	private static final long serialVersionUID = 1L;

	public String pays, ville;
	public float longueur, altitude;
	
	public Reponse(String pays, String ville, float longueur, float altitude)
	{
		this.pays = pays;
		this.ville = ville;
		this.longueur = longueur;
		this.altitude = altitude;
	}
}
